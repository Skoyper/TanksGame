package com.mygdx.game.units;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Weapon;

public class BotTank extends Tank{

    float preferredAngle;
    float aiTimer;
    float aiTimerTo;


    public BotTank(MyGdxGame game) {
        super(game);
        this.weapon = new Weapon();
        this.texture = new Texture("bot_Tank.png");
        this.position = new Vector2(500.0f, 500.0f);
        this.speed = 100.0f;
        this.wight = texture.getWidth();
        this.height = texture.getHeight();
        this.hpMax = 3;
        this.hp = this.hpMax;
        this.aiTimerTo = 3.0f;
    }


    public void update(float dt){
        aiTimer += dt;
        if (aiTimer > aiTimerTo){
            aiTimer = 0.0f;
            aiTimerTo = MathUtils.random(2.5f, 4.0f);
            preferredAngle = MathUtils.random(0, 360.0f);
        }
    }
}
