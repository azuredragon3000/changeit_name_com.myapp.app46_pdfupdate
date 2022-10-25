package com.myapp.demototalgame;

import android.graphics.PointF;

class PlayerUpdateComponent implements UpdateComponent {

    private boolean mIsJumping = false;
    private long mJumpStartTime;

    // How long a jump lasts
    // Further subdivided into up time and down time, later
    private final long MAX_JUMP_TIME = 400;
    private final float GRAVITY = 6;

    public void update(long fps,
                       Transform t,
                       Transform playerTransform) {

        // cast to player transform
        PlayerTransform pt = (PlayerTransform) t;

        // Where is the player?
        PointF location = t.getLocation();
        // How fast is it going
        float speed = t.getSpeed();

        if (t.headingLeft()) {
            location.x -= speed / fps;
        } else if (t.headingRight()) {
            location.x += speed / fps;
        }

        if(location.x  == t.destinationX ) {
            t.stopHorizontal();
        }
        // Let the colliders know the new position
        t.updateCollider();
    }
}
