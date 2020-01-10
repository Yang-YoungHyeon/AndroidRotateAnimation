package com.sample.animate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation rotate_interpolator_1s,rotate_interpolator_2s,rotate_interpolator_3s,rotate_interpolator_4s,rotate_interpolator_5s;

    Animation rotate_accelerate_interpolator_1s,rotate_accelerate_interpolator_2s,
            rotate_accelerate_interpolator_3s,rotate_accelerate_interpolator_4s,rotate_accelerate_interpolator_5s;

    Animation rotate_decelerate_interpolator_1s,rotate_decelerate_interpolator_2s,rotate_decelerate_interpolator_3s,
            rotate_decelerate_interpolator_4s,rotate_decelerate_interpolator_5s;

    Animation rotate_accelerate_decelerate_interpolator_1s,rotate_accelerate_decelerate_interpolator_2s,rotate_accelerate_decelerate_interpolator_3s,
            rotate_accelerate_decelerate_interpolator_4s,rotate_accelerate_decelerate_interpolator_5s;

    Animation rotate_overshoot_interpolator_1s,rotate_overshoot_interpolator_2s,rotate_overshoot_interpolator_3s,
            rotate_overshoot_interpolator_4s,rotate_overshoot_interpolator_5s;

    Animation rotate_bounce_interpolator_1s,rotate_bounce_interpolator_2s,rotate_bounce_interpolator_3s,
            rotate_bounce_interpolator_4s,rotate_bounce_interpolator_5s;

    Animation rotate_cycle_interpolator_1s,rotate_cycle_interpolator_2s,rotate_cycle_interpolator_3s,
            rotate_cycle_interpolator_4s,rotate_cycle_interpolator_5s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotate_Linear_Interpolator();
        rotate_Accelerate_Interpolator();
        rotate_Decelerate_Interpolator();
        rotate_Accelerate_Decelerate_Interpolator();
        rotate_Overshoot_Interpolator();
        rotate_Bounce_Interpolator();
        rotate_Cycle_Interpolator();

        Animation test = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_test);
        findViewById(R.id.iv_line36).startAnimation(test);
        Animation test2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_test2);
        findViewById(R.id.iv_line37).startAnimation(test2);
    }
    /** 애니메이션 회전 속도 : 일정 */
    private void rotate_Linear_Interpolator(){
        rotate_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_linear_interpolator_1s);
        findViewById(R.id.iv_line1).startAnimation(rotate_interpolator_1s);
        rotate_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_linear_interpolator_2s);
        findViewById(R.id.iv_line2).startAnimation(rotate_interpolator_2s);
        rotate_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_linear_interpolator_3s);
        findViewById(R.id.iv_line3).startAnimation(rotate_interpolator_3s);
        rotate_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_linear_interpolator_4s);
        findViewById(R.id.iv_line4).startAnimation(rotate_interpolator_4s);
        rotate_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_linear_interpolator_5s);
        findViewById(R.id.iv_line5).startAnimation(rotate_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 처음에 느리다가 빨라짐 */
    private void rotate_Accelerate_Interpolator(){
        rotate_accelerate_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_interpolator_1s);
        findViewById(R.id.iv_line6).startAnimation(rotate_accelerate_interpolator_1s);
        rotate_accelerate_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_interpolator_2s);
        findViewById(R.id.iv_line7).startAnimation(rotate_accelerate_interpolator_2s);
        rotate_accelerate_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_interpolator_3s);
        findViewById(R.id.iv_line8).startAnimation(rotate_accelerate_interpolator_3s);
        rotate_accelerate_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_interpolator_4s);
        findViewById(R.id.iv_line9).startAnimation(rotate_accelerate_interpolator_4s);
        rotate_accelerate_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_interpolator_5s);
        findViewById(R.id.iv_line10).startAnimation(rotate_accelerate_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 처음에 빠르다가 점점 느려짐 */
    private void rotate_Decelerate_Interpolator(){
        rotate_decelerate_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_decelerate_interpolator_1s);
        findViewById(R.id.iv_line11).startAnimation(rotate_decelerate_interpolator_1s);
        rotate_decelerate_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_decelerate_interpolator_2s);
        findViewById(R.id.iv_line12).startAnimation(rotate_decelerate_interpolator_2s);
        rotate_decelerate_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_decelerate_interpolator_3s);
        findViewById(R.id.iv_line13).startAnimation(rotate_decelerate_interpolator_3s);
        rotate_decelerate_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_decelerate_interpolator_4s);
        findViewById(R.id.iv_line14).startAnimation(rotate_decelerate_interpolator_4s);
        rotate_decelerate_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_decelerate_interpolator_5s);
        findViewById(R.id.iv_line15).startAnimation(rotate_decelerate_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 과속했다가 급정거 */
    private void rotate_Accelerate_Decelerate_Interpolator(){

        rotate_accelerate_decelerate_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_decelerate_interpolator_1s);
        findViewById(R.id.iv_line16).startAnimation(rotate_accelerate_decelerate_interpolator_1s);
        rotate_accelerate_decelerate_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_decelerate_interpolator_2s);
        findViewById(R.id.iv_line17).startAnimation(rotate_accelerate_decelerate_interpolator_2s);
        rotate_accelerate_decelerate_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_decelerate_interpolator_3s);
        findViewById(R.id.iv_line18).startAnimation(rotate_accelerate_decelerate_interpolator_3s);
        rotate_accelerate_decelerate_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_decelerate_interpolator_4s);
        findViewById(R.id.iv_line19).startAnimation(rotate_accelerate_decelerate_interpolator_4s);
        rotate_accelerate_decelerate_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_accelerate_decelerate_interpolator_5s);
        findViewById(R.id.iv_line20).startAnimation(rotate_accelerate_decelerate_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 마지막 부분에서 약간 더 진행 */
    private void rotate_Overshoot_Interpolator(){
        rotate_overshoot_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_overshoot_interpolator_1s);
        findViewById(R.id.iv_line21).startAnimation(rotate_overshoot_interpolator_1s);
        rotate_overshoot_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_overshoot_interpolator_2s);
        findViewById(R.id.iv_line22).startAnimation(rotate_overshoot_interpolator_2s);
        rotate_overshoot_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_overshoot_interpolator_3s);
        findViewById(R.id.iv_line23).startAnimation(rotate_overshoot_interpolator_3s);
        rotate_overshoot_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_overshoot_interpolator_4s);
        findViewById(R.id.iv_line24).startAnimation(rotate_overshoot_interpolator_4s);
        rotate_overshoot_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_overshoot_interpolator_5s);
        findViewById(R.id.iv_line25).startAnimation(rotate_overshoot_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 애니메이션이 마지막에 통통 튐 */
    private void rotate_Bounce_Interpolator(){
        rotate_bounce_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bounce_interpolator_1s);
        findViewById(R.id.iv_line26).startAnimation(rotate_bounce_interpolator_1s);
        rotate_bounce_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bounce_interpolator_2s);
        findViewById(R.id.iv_line27).startAnimation(rotate_bounce_interpolator_2s);
        rotate_bounce_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bounce_interpolator_3s);
        findViewById(R.id.iv_line28).startAnimation(rotate_bounce_interpolator_3s);
        rotate_bounce_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bounce_interpolator_4s);
        findViewById(R.id.iv_line29).startAnimation(rotate_bounce_interpolator_4s);
        rotate_bounce_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_bounce_interpolator_5s);
        findViewById(R.id.iv_line30).startAnimation(rotate_bounce_interpolator_5s);
    }
    /** 애니메이션 회전 속도 : 마지막까지갔다가 다시 처음으로 돌아옴 */
    private void rotate_Cycle_Interpolator(){
        rotate_cycle_interpolator_1s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_cycle_interpolator_1s);
        findViewById(R.id.iv_line31).startAnimation(rotate_cycle_interpolator_1s);
        rotate_cycle_interpolator_2s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_cycle_interpolator_2s);
        findViewById(R.id.iv_line32).startAnimation(rotate_cycle_interpolator_2s);
        rotate_cycle_interpolator_3s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_cycle_interpolator_3s);
        findViewById(R.id.iv_line33).startAnimation(rotate_cycle_interpolator_3s);
        rotate_cycle_interpolator_4s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_cycle_interpolator_4s);
        findViewById(R.id.iv_line34).startAnimation(rotate_cycle_interpolator_4s);
        rotate_cycle_interpolator_5s = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_cycle_interpolator_5s);
        findViewById(R.id.iv_line35).startAnimation(rotate_cycle_interpolator_5s);
    }
}
