/*
 * Copyright 2015 Cesar Diez Sanchez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cesards.samples.cropimageview.activity;

import android.content.res.Resources;
import android.widget.ImageView;
import com.cesards.samples.cropimageview.R;
import com.cesards.samples.cropimageview.widget.TestForegroundImageView;

public class SimpleCropActivity extends CropActivity {

  private int[] images = {
      R.drawable.zombie,
      R.drawable.ball_centered_bottom_ball,
  };

  @Override protected int getImagesCount() {
    return images.length;
  }

  @Override protected ImageView instantiatePagerItem(int position) {
    TestForegroundImageView testForegroundImageView = new TestForegroundImageView(SimpleCropActivity.this);
    final Resources res = getResources();
    testForegroundImageView.setImageDrawable(res.getDrawable(images[position]));
    testForegroundImageView.setForeground(res.getDrawable(R.drawable.shape_grad_black_transp_70));
    testForegroundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

    return testForegroundImageView;
  }
}
