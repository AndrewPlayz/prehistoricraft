package net.andrewplayz.prehistoricraft.client.model.acrocanthosaurus;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AcrocanthosaurusFemale extends MowzieModelBase {
    public MowzieModelRenderer Mainbody1;
    public MowzieModelRenderer Thighright;
    public MowzieModelRenderer Thightleft;
    public MowzieModelRenderer Mainbody2;
    public MowzieModelRenderer Tail1;
    public MowzieModelRenderer Mainbody1spine;
    public MowzieModelRenderer Neck1;
    public MowzieModelRenderer Mainbody2spine;
    public MowzieModelRenderer Rightshoulder;
    public MowzieModelRenderer Leftshoulder;
    public MowzieModelRenderer Neck2;
    public MowzieModelRenderer Neck1spine;
    public MowzieModelRenderer Neck3;
    public MowzieModelRenderer Necklower;
    public MowzieModelRenderer Neck2spine;
    public MowzieModelRenderer Head1;
    public MowzieModelRenderer Neck3spine;
    public MowzieModelRenderer Fronthead1;
    public MowzieModelRenderer Jawlower;
    public MowzieModelRenderer Fronthead2;
    public MowzieModelRenderer Jawupper;
    public MowzieModelRenderer shape98;
    public MowzieModelRenderer Browfrontright;
    public MowzieModelRenderer Teethupperleft;
    public MowzieModelRenderer Teethupperright;
    public MowzieModelRenderer Teethupperfront;
    public MowzieModelRenderer Browbehindleft;
    public MowzieModelRenderer Browbehindright;
    public MowzieModelRenderer Jawunderside;
    public MowzieModelRenderer Teethlowerleft;
    public MowzieModelRenderer Teethlowerright;
    public MowzieModelRenderer Teethlowerfront;
    public MowzieModelRenderer Upperarmright;
    public MowzieModelRenderer Lowerarmright;
    public MowzieModelRenderer Handright;
    public MowzieModelRenderer Finger1upperright;
    public MowzieModelRenderer Finger1middleright;
    public MowzieModelRenderer Finger1lowerright;
    public MowzieModelRenderer Finger2upperright;
    public MowzieModelRenderer Finger2middleright;
    public MowzieModelRenderer Finger1lowerright_1;
    public MowzieModelRenderer Upperarmleft;
    public MowzieModelRenderer Lowerarmleft;
    public MowzieModelRenderer Handleft;
    public MowzieModelRenderer Finger1upperleft;
    public MowzieModelRenderer Finger1middleleft;
    public MowzieModelRenderer Finger1lowerleft;
    public MowzieModelRenderer Finger2upperleft;
    public MowzieModelRenderer Finger2middleleft;
    public MowzieModelRenderer Finger2lowerleft;
    public MowzieModelRenderer Tail2;
    public MowzieModelRenderer Tailspine1;
    public MowzieModelRenderer Tail3;
    public MowzieModelRenderer Tailspine2;
    public MowzieModelRenderer Tail4;
    public MowzieModelRenderer Tailspine3;
    public MowzieModelRenderer Tail5;
    public MowzieModelRenderer Tailspine4;
    public MowzieModelRenderer Tailspine5;
    public MowzieModelRenderer Upperlegfrontright;
    public MowzieModelRenderer Upperlegbackright;
    public MowzieModelRenderer Lowerlegright;
    public MowzieModelRenderer Heelright;
    public MowzieModelRenderer Uppermiddletoeright;
    public MowzieModelRenderer Upperlefttoeright;
    public MowzieModelRenderer Upperrighttoeright;
    public MowzieModelRenderer Soleright;
    public MowzieModelRenderer Lowermiddletoeright;
    public MowzieModelRenderer Middletoesoleright;
    public MowzieModelRenderer Lowerlefttoeright;
    public MowzieModelRenderer Lefttoesoleright;
    public MowzieModelRenderer Lowerrighttoeright;
    public MowzieModelRenderer Righttoesoleright;
    public MowzieModelRenderer Upperlegfrontleft;
    public MowzieModelRenderer Upperlegbackleft;
    public MowzieModelRenderer Lowerlegleft;
    public MowzieModelRenderer Heelleft;
    public MowzieModelRenderer Uppermiddletoeleft;
    public MowzieModelRenderer Upperlefttoeleft;
    public MowzieModelRenderer Upperlefttoeleft_1;
    public MowzieModelRenderer Soleleft;
    public MowzieModelRenderer Lowermiddletoeleft;
    public MowzieModelRenderer Middletoesoleleft;
    public MowzieModelRenderer Lowerleftoeleft;
    public MowzieModelRenderer Righttoesoleleft;
    public MowzieModelRenderer Lowerrighttoeleft;
    public MowzieModelRenderer Lefttoesoleleft;

    public AcrocanthosaurusFemale() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Jawupper = new MowzieModelRenderer(this, 135, 200);
        this.Jawupper.setRotationPoint(-0.01F, 1.96F, 0.1F);
        this.Jawupper.addBox(-2.5F, 0.0F, -16.0F, 5, 5, 16, 0.0F);
        this.setRotateAngle(Jawupper, -0.05969026041820607F, 0.0F, 0.0F);
        this.Upperlefttoeleft_1 = new MowzieModelRenderer(this, 500, 220);
        this.Upperlefttoeleft_1.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Upperlefttoeleft_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeleft_1, -0.27314402793711257F, -0.36425021489121656F, -0.18203784098300857F);
        this.Handleft = new MowzieModelRenderer(this, 340, 175);
        this.Handleft.setRotationPoint(-0.15F, 7.81F, 0.02F);
        this.Handleft.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(Handleft, 0.0F, -0.091106186954104F, 0.36425021489121656F);
        this.Heelleft = new MowzieModelRenderer(this, 260, 130);
        this.Heelleft.setRotationPoint(0.0F, -3.64F, 9.6F);
        this.Heelleft.addBox(-2.0F, 0.0F, 0.0F, 4, 11, 5, 0.0F);
        this.setRotateAngle(Heelleft, 0.5009094953223726F, 0.0F, 0.0F);
        this.Lowerlefttoeright = new MowzieModelRenderer(this, 500, 230);
        this.Lowerlefttoeright.setRotationPoint(0.98F, 3.96F, 0.15F);
        this.Lowerlefttoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerlefttoeright, -0.5462880558742251F, 0.0F, 0.0F);
        this.Fronthead2 = new MowzieModelRenderer(this, 135, 155);
        this.Fronthead2.setRotationPoint(0.01F, 0.0F, -6.9F);
        this.Fronthead2.addBox(-2.5F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
        this.setRotateAngle(Fronthead2, -1.4570008595648662F, 0.0F, 0.0F);
        this.Teethupperleft = new MowzieModelRenderer(this, 480, 0);
        this.Teethupperleft.setRotationPoint(2.3F, 4.0F, -3.0F);
        this.Teethupperleft.addBox(0.0F, 0.0F, -13.0F, 0, 2, 13, 0.0F);
        this.Tail5 = new MowzieModelRenderer(this, 5, 20);
        this.Tail5.setRotationPoint(0.0F, 0.16F, 15.9F);
        this.Tail5.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 18, 0.0F);
        this.setRotateAngle(Tail5, -0.091106186954104F, 0.0F, 0.0F);
        this.Middletoesoleleft = new MowzieModelRenderer(this, 500, 240);
        this.Middletoesoleleft.setRotationPoint(-0.01F, -2.6F, 2.2F);
        this.Middletoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Middletoesoleleft, -0.31869712141416456F, 0.0F, 0.0F);
        this.Upperlegbackleft = new MowzieModelRenderer(this, 260, 180);
        this.Upperlegbackleft.setRotationPoint(0.0F, 11.4F, 5.56F);
        this.Upperlegbackleft.addBox(-2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.Upperlegfrontleft = new MowzieModelRenderer(this, 260, 200);
        this.Upperlegfrontleft.setRotationPoint(0.02F, 12.49F, 0.47F);
        this.Upperlegfrontleft.addBox(-2.5F, 0.0F, 0.0F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Upperlegfrontleft, 0.22759093446006054F, 0.0F, 0.0F);
        this.Upperlegbackright = new MowzieModelRenderer(this, 260, 180);
        this.Upperlegbackright.setRotationPoint(0.0F, 11.4F, 5.56F);
        this.Upperlegbackright.addBox(-2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.Upperlefttoeright = new MowzieModelRenderer(this, 500, 220);
        this.Upperlefttoeright.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Upperlefttoeright.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeright, -0.27314402793711257F, -0.36425021489121656F, -0.18203784098300857F);
        this.Tailspine5 = new MowzieModelRenderer(this, 190, 80);
        this.Tailspine5.setRotationPoint(0.0F, -2.15F, 0.0F);
        this.Tailspine5.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 18, 0.0F);
        this.setRotateAngle(Tailspine5, -0.11623892818282235F, 0.0F, 0.0F);
        this.Neck1 = new MowzieModelRenderer(this, 90, 230);
        this.Neck1.setRotationPoint(0.0F, 4.08F, -7.5F);
        this.Neck1.addBox(-4.5F, 0.0F, -11.0F, 9, 10, 10, 0.0F);
        this.setRotateAngle(Neck1, -0.6373942428283291F, 0.0F, 0.0F);
        this.Lowerarmright = new MowzieModelRenderer(this, 315, 190);
        this.Lowerarmright.setRotationPoint(0.45F, 3.78F, 1.75F);
        this.Lowerarmright.addBox(0.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(Lowerarmright, -1.7756979809790308F, -0.091106186954104F, 0.136659280431156F);
        this.Upperlegfrontright = new MowzieModelRenderer(this, 260, 200);
        this.Upperlegfrontright.setRotationPoint(0.0F, 12.49F, 0.47F);
        this.Upperlegfrontright.addBox(-2.5F, 0.0F, 0.0F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Upperlegfrontright, 0.22759093446006054F, 0.0F, 0.0F);
        this.Middletoesoleright = new MowzieModelRenderer(this, 500, 240);
        this.Middletoesoleright.setRotationPoint(0.01F, -2.6F, 2.2F);
        this.Middletoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Middletoesoleright, -0.31869712141416456F, 0.0F, 0.0F);
        this.Rightshoulder = new MowzieModelRenderer(this, 315, 240);
        this.Rightshoulder.setRotationPoint(-4.1F, 6.0F, -8.42F);
        this.Rightshoulder.addBox(-3.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rightshoulder, 0.5009094953223726F, 0.0F, 0.18203784098300857F);
        this.Neck3spine = new MowzieModelRenderer(this, 190, 0);
        this.Neck3spine.setRotationPoint(-0.01F, -2.84F, 1.13F);
        this.Neck3spine.addBox(-1.0F, 0.0F, -9.0F, 2, 4, 9, 0.0F);
        this.setRotateAngle(Neck3spine, 0.342259066316088F, 0.0F, 0.0F);
        this.Tail1 = new MowzieModelRenderer(this, 5, 140);
        this.Tail1.setRotationPoint(0.0F, 0.54F, 18.23F);
        this.Tail1.addBox(-5.5F, 0.0F, 0.0F, 11, 13, 15, 0.0F);
        this.setRotateAngle(Tail1, 0.136659280431156F, 0.0F, 0.0F);
        this.Lowermiddletoeleft = new MowzieModelRenderer(this, 500, 230);
        this.Lowermiddletoeleft.setRotationPoint(0.0F, 4.1F, 0.26F);
        this.Lowermiddletoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowermiddletoeleft, -0.4553564018453205F, 0.0F, 0.0F);
        this.Thightleft = new MowzieModelRenderer(this, 260, 230);
        this.Thightleft.setRotationPoint(8.0F, -15.0F, 2.0F);
        this.Thightleft.addBox(-3.5F, 0.0F, 0.0F, 7, 13, 10, 0.0F);
        this.setRotateAngle(Thightleft, -0.40980330836826856F, 0.0F, 0.0F);
        this.Handright = new MowzieModelRenderer(this, 315, 175);
        this.Handright.setRotationPoint(0.15F, 7.81F, 0.02F);
        this.Handright.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(Handright, 0.0F, 0.091106186954104F, -0.36425021489121656F);
        this.Thighright = new MowzieModelRenderer(this, 260, 230);
        this.Thighright.setRotationPoint(-8.0F, -15.0F, 2.0F);
        this.Thighright.addBox(-3.5F, 0.0F, 0.0F, 7, 13, 10, 0.0F);
        this.setRotateAngle(Thighright, -0.40980330836826856F, 0.0F, 0.0F);
        this.Finger2middleleft = new MowzieModelRenderer(this, 340, 155);
        this.Finger2middleleft.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2middleleft.addBox(-1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger2middleleft, 1.5481070465189704F, 0.045553093477052F, 0.36425021489121656F);
        this.Lefttoesoleright = new MowzieModelRenderer(this, 500, 240);
        this.Lefttoesoleright.setRotationPoint(-0.01F, -2.7F, 1.9F);
        this.Lefttoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Lefttoesoleright, -0.27314402793711257F, 0.0F, 0.0F);
        this.Leftshoulder = new MowzieModelRenderer(this, 340, 240);
        this.Leftshoulder.setRotationPoint(4.1F, 6.0F, -8.42F);
        this.Leftshoulder.addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Leftshoulder, 0.5009094953223726F, 0.0F, -0.18203784098300857F);
        this.Heelright = new MowzieModelRenderer(this, 260, 130);
        this.Heelright.setRotationPoint(0.0F, -3.64F, 9.6F);
        this.Heelright.addBox(-2.0F, 0.0F, 0.0F, 4, 11, 5, 0.0F);
        this.setRotateAngle(Heelright, 0.5009094953223726F, 0.0F, 0.0F);
        this.Fronthead1 = new MowzieModelRenderer(this, 135, 180);
        this.Fronthead1.setRotationPoint(-0.01F, 0.17F, -4.9F);
        this.Fronthead1.addBox(-2.5F, 0.0F, -7.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Fronthead1, 0.10524335389525807F, 0.0F, 0.0F);
        this.Tailspine1 = new MowzieModelRenderer(this, 190, 200);
        this.Tailspine1.setRotationPoint(-0.01F, -4.74F, 5.23F);
        this.Tailspine1.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 11, 0.0F);
        this.setRotateAngle(Tailspine1, -0.025132741228718346F, 0.0F, 0.0F);
        this.Upperarmleft = new MowzieModelRenderer(this, 340, 220);
        this.Upperarmleft.setRotationPoint(2.98F, 4.42F, -1.21F);
        this.Upperarmleft.addBox(-3.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Upperarmleft, -0.091106186954104F, 0.0F, 0.045553093477052F);
        this.Lowerlegright = new MowzieModelRenderer(this, 260, 155);
        this.Lowerlegright.setRotationPoint(-0.04F, 10.01F, 0.15F);
        this.Lowerlegright.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 14, 0.0F);
        this.setRotateAngle(Lowerlegright, -0.6829473363053812F, 0.0F, 0.0F);
        this.Browfrontright = new MowzieModelRenderer(this, 0, 0);
        this.Browfrontright.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.Browfrontright.addBox(-2.0F, 0.0F, -9.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(Browfrontright, 0.045553093477052F, 0.2516764781375823F, -0.22759093446006054F);
        this.Finger1lowerleft = new MowzieModelRenderer(this, 340, 165);
        this.Finger1lowerleft.setRotationPoint(0.2F, 2.0F, 2.5F);
        this.Finger1lowerleft.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1lowerleft, 0.277332818141899F, 0.04537856055185257F, 0.045553093477052F);
        this.Finger1lowerright = new MowzieModelRenderer(this, 315, 165);
        this.Finger1lowerright.setRotationPoint(0.0F, 2.0F, 2.5F);
        this.Finger1lowerright.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1lowerright, 0.277332818141899F, 0.04537856055185257F, 0.045553093477052F);
        this.Neck2 = new MowzieModelRenderer(this, 90, 200);
        this.Neck2.setRotationPoint(-0.01F, 0.32F, -11.0F);
        this.Neck2.addBox(-3.0F, 0.0F, -8.0F, 6, 9, 8, 0.0F);
        this.setRotateAngle(Neck2, 0.27314402793711257F, 0.0F, 0.0F);
        this.Browbehindleft = new MowzieModelRenderer(this, 0, 0);
        this.Browbehindleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Browbehindleft.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Browbehindleft, 0.0F, 0.5009094953223726F, 0.0F);
        this.Tail3 = new MowzieModelRenderer(this, 5, 80);
        this.Tail3.setRotationPoint(0.0F, 0.29F, 17.0F);
        this.Tail3.addBox(-3.5F, 0.0F, -1.0F, 7, 9, 17, 0.0F);
        this.setRotateAngle(Tail3, -0.04537856055185257F, 0.0F, 0.0F);
        this.Finger2upperleft = new MowzieModelRenderer(this, 340, 155);
        this.Finger2upperleft.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2upperleft.addBox(-1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger2upperleft, 1.593485607070823F, 0.0F, 0.5462880558742251F);
        this.Tailspine3 = new MowzieModelRenderer(this, 190, 130);
        this.Tailspine3.setRotationPoint(0.0F, -3.84F, -2.0F);
        this.Tailspine3.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 18, 0.0F);
        this.setRotateAngle(Tailspine3, -0.06440264939859076F, 0.0F, 0.0F);
        this.Teethupperright = new MowzieModelRenderer(this, 480, 0);
        this.Teethupperright.setRotationPoint(-2.3F, 4.0F, -3.0F);
        this.Teethupperright.addBox(0.0F, 0.0F, -13.0F, 0, 2, 13, 0.0F);
        this.Soleright = new MowzieModelRenderer(this, 490, 210);
        this.Soleright.setRotationPoint(0.01F, 10.6F, 0.0F);
        this.Soleright.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Soleright, 0.36425021489121656F, 0.0F, 0.0F);
        this.Head1 = new MowzieModelRenderer(this, 135, 235);
        this.Head1.setRotationPoint(0.0F, 0.07F, -5.0F);
        this.Head1.addBox(-3.5F, 0.0F, -7.0F, 7, 11, 7, 0.0F);
        this.setRotateAngle(Head1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Tail2 = new MowzieModelRenderer(this, 5, 110);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 14.93F);
        this.Tail2.addBox(-4.5F, 0.0F, -1.0F, 9, 11, 17, 0.0F);
        this.Mainbody2 = new MowzieModelRenderer(this, 5, 175);
        this.Mainbody2.setRotationPoint(0.0F, 0.94F, 0.0F);
        this.Mainbody2.addBox(-6.0F, 0.0F, -15.0F, 12, 14, 15, 0.0F);
        this.setRotateAngle(Mainbody2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Uppermiddletoeleft = new MowzieModelRenderer(this, 500, 220);
        this.Uppermiddletoeleft.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Uppermiddletoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Uppermiddletoeleft, -0.40980330836826856F, 0.0F, 0.0F);
        this.Lowerleftoeleft = new MowzieModelRenderer(this, 500, 230);
        this.Lowerleftoeleft.setRotationPoint(-0.98F, 3.96F, 0.15F);
        this.Lowerleftoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerleftoeleft, -0.5462880558742251F, 0.0F, 0.0F);
        this.Neck2spine = new MowzieModelRenderer(this, 215, 35);
        this.Neck2spine.setRotationPoint(-0.01F, -4.47F, 0.3F);
        this.Neck2spine.addBox(-1.0F, 0.0F, -8.0F, 2, 5, 8, 0.0F);
        this.setRotateAngle(Neck2spine, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape98 = new MowzieModelRenderer(this, 0, 0);
        this.shape98.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.shape98.addBox(0.0F, 0.0F, -9.0F, 2, 1, 9, 0.0F);
        this.setRotateAngle(shape98, 0.045553093477052F, -0.2516764781375823F, 0.22759093446006054F);
        this.Teethlowerleft = new MowzieModelRenderer(this, 480, 20);
        this.Teethlowerleft.setRotationPoint(1.5F, -1.0F, -3.5F);
        this.Teethlowerleft.addBox(0.0F, 0.0F, -10.0F, 0, 2, 10, 0.0F);
        this.Upperarmright = new MowzieModelRenderer(this, 315, 220);
        this.Upperarmright.setRotationPoint(-2.98F, 4.42F, -1.21F);
        this.Upperarmright.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Upperarmright, -0.091106186954104F, 0.0F, -0.045553093477052F);
        this.Lowerrighttoeright = new MowzieModelRenderer(this, 500, 230);
        this.Lowerrighttoeright.setRotationPoint(-1.0F, 3.56F, 0.05F);
        this.Lowerrighttoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerrighttoeright, -0.40980330836826856F, 0.045553093477052F, 0.0F);
        this.Teethlowerright = new MowzieModelRenderer(this, 480, 20);
        this.Teethlowerright.setRotationPoint(-1.5F, -1.0F, -3.5F);
        this.Teethlowerright.addBox(0.0F, 0.0F, -10.0F, 0, 2, 10, 0.0F);
        this.Teethlowerfront = new MowzieModelRenderer(this, 460, 25);
        this.Teethlowerfront.setRotationPoint(0.0F, 0.0F, -13.5F);
        this.Teethlowerfront.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 0, 0.0F);
        this.Finger1upperleft = new MowzieModelRenderer(this, 340, 165);
        this.Finger1upperleft.setRotationPoint(0.2F, 2.0F, 0.6F);
        this.Finger1upperleft.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1upperleft, -0.31869712141416456F, -0.045553093477052F, -0.18203784098300857F);
        this.Upperlefttoeleft = new MowzieModelRenderer(this, 500, 220);
        this.Upperlefttoeleft.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Upperlefttoeleft.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperlefttoeleft, -0.27314402793711257F, 0.36425021489121656F, 0.18203784098300857F);
        this.Tailspine4 = new MowzieModelRenderer(this, 190, 105);
        this.Tailspine4.setRotationPoint(0.0F, -3.0F, -0.7F);
        this.Tailspine4.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 17, 0.0F);
        this.setRotateAngle(Tailspine4, -0.05811946409141117F, 0.0F, 0.0F);
        this.Browbehindright = new MowzieModelRenderer(this, 0, 0);
        this.Browbehindright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Browbehindright.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Browbehindright, 0.0F, -0.5009094953223726F, 0.0F);
        this.Lowermiddletoeright = new MowzieModelRenderer(this, 500, 230);
        this.Lowermiddletoeright.setRotationPoint(0.0F, 4.1F, 0.26F);
        this.Lowermiddletoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowermiddletoeright, -0.4553564018453205F, 0.0F, 0.0F);
        this.Lowerlegleft = new MowzieModelRenderer(this, 260, 155);
        this.Lowerlegleft.setRotationPoint(0.04F, 10.01F, 0.15F);
        this.Lowerlegleft.addBox(-2.5F, -6.0F, 0.0F, 5, 6, 14, 0.0F);
        this.setRotateAngle(Lowerlegleft, -0.6829473363053812F, 0.0F, 0.0F);
        this.Jawlower = new MowzieModelRenderer(this, 135, 130);
        this.Jawlower.setRotationPoint(-0.01F, 7.07F, -6.0F);
        this.Jawlower.addBox(-2.0F, 0.0F, -14.0F, 4, 2, 14, 0.0F);
        this.Finger1upperright = new MowzieModelRenderer(this, 315, 165);
        this.Finger1upperright.setRotationPoint(0.0F, 2.0F, 0.6F);
        this.Finger1upperright.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1upperright, -0.31869712141416456F, -0.045553093477052F, 0.18203784098300857F);
        this.Tail4 = new MowzieModelRenderer(this, 5, 55);
        this.Tail4.setRotationPoint(0.0F, 0.25F, 16.0F);
        this.Tail4.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 17, 0.0F);
        this.setRotateAngle(Tail4, -0.045553093477052F, 0.0F, 0.0F);
        this.Finger1middleright = new MowzieModelRenderer(this, 315, 165);
        this.Finger1middleright.setRotationPoint(0.0F, 2.0F, 1.5F);
        this.Finger1middleright.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1middleright, 0.0F, 0.0F, 0.31869712141416456F);
        this.Finger2middleright = new MowzieModelRenderer(this, 315, 155);
        this.Finger2middleright.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2middleright.addBox(0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger2middleright, 1.5481070465189704F, 0.045553093477052F, -0.36425021489121656F);
        this.Tailspine2 = new MowzieModelRenderer(this, 190, 160);
        this.Tailspine2.setRotationPoint(0.0F, -4.44F, 1.0F);
        this.Tailspine2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 15, 0.0F);
        this.setRotateAngle(Tailspine2, -0.05811946409141117F, 0.0F, 0.0F);
        this.Jawunderside = new MowzieModelRenderer(this, 135, 100);
        this.Jawunderside.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jawunderside.addBox(-1.5F, 0.0F, -11.0F, 3, 2, 11, 0.0F);
        this.setRotateAngle(Jawunderside, -0.18203784098300857F, 0.0F, 0.0F);
        this.Finger1middleleft = new MowzieModelRenderer(this, 340, 165);
        this.Finger1middleleft.setRotationPoint(0.2F, 2.8F, 1.5F);
        this.Finger1middleleft.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Finger1middleleft, 0.0F, 0.0F, -0.31869712141416456F);
        this.Righttoesoleright = new MowzieModelRenderer(this, 500, 240);
        this.Righttoesoleright.setRotationPoint(0.01F, -2.3F, 3.0F);
        this.Righttoesoleright.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Righttoesoleright, -0.4379031093253773F, 0.0F, 0.0F);
        this.Lowerrighttoeleft = new MowzieModelRenderer(this, 500, 230);
        this.Lowerrighttoeleft.setRotationPoint(0.98F, 3.56F, 0.05F);
        this.Lowerrighttoeleft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Lowerrighttoeleft, -0.40980330836826856F, 0.045553093477052F, 0.0F);
        this.Lowerarmleft = new MowzieModelRenderer(this, 340, 190);
        this.Lowerarmleft.setRotationPoint(-0.45F, 3.78F, 1.75F);
        this.Lowerarmleft.addBox(-2.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(Lowerarmleft, -1.7756979809790308F, 0.091106186954104F, -0.136659280431156F);
        this.Mainbody1spine = new MowzieModelRenderer(this, 190, 220);
        this.Mainbody1spine.setRotationPoint(0.0F, -5.07F, 0.5F);
        this.Mainbody1spine.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 24, 0.0F);
        this.Soleleft = new MowzieModelRenderer(this, 490, 210);
        this.Soleleft.setRotationPoint(-0.02F, 10.6F, 0.0F);
        this.Soleleft.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Soleleft, 0.40980330836826856F, 0.0F, 0.0F);
        this.Finger2lowerleft = new MowzieModelRenderer(this, 340, 155);
        this.Finger2lowerleft.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.Finger2lowerleft.addBox(-1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger2lowerleft, 1.5481070465189704F, -0.045553093477052F, 0.36425021489121656F);
        this.Necklower = new MowzieModelRenderer(this, 90, 150);
        this.Necklower.setRotationPoint(0.0F, 8.06F, 5.1F);
        this.Necklower.addBox(-2.0F, 0.0F, -14.5F, 4, 4, 16, 0.0F);
        this.Finger1lowerright_1 = new MowzieModelRenderer(this, 315, 155);
        this.Finger1lowerright_1.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.Finger1lowerright_1.addBox(0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger1lowerright_1, 1.5481070465189704F, 0.045553093477052F, -0.36425021489121656F);
        this.Teethupperfront = new MowzieModelRenderer(this, 460, 10);
        this.Teethupperfront.setRotationPoint(0.0F, 4.0F, -15.9F);
        this.Teethupperfront.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 0, 0.0F);
        this.Upperrighttoeright = new MowzieModelRenderer(this, 500, 220);
        this.Upperrighttoeright.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Upperrighttoeright.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Upperrighttoeright, -0.27314402793711257F, 0.36425021489121656F, 0.18203784098300857F);
        this.Mainbody2spine = new MowzieModelRenderer(this, 190, 50);
        this.Mainbody2spine.setRotationPoint(-0.01F, -5.8F, 2.08F);
        this.Mainbody2spine.addBox(-1.0F, 0.0F, -15.0F, 2, 6, 15, 0.0F);
        this.setRotateAngle(Mainbody2spine, 0.091106186954104F, 0.0F, 0.0F);
        this.Finger2upperright = new MowzieModelRenderer(this, 315, 155);
        this.Finger2upperright.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Finger2upperright.addBox(0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Finger2upperright, 1.593485607070823F, 0.0F, -0.5462880558742251F);
        this.Neck3 = new MowzieModelRenderer(this, 90, 180);
        this.Neck3.setRotationPoint(-0.03F, -0.04F, -7.4F);
        this.Neck3.addBox(-3.0F, 0.0F, -6.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(Neck3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Mainbody1 = new MowzieModelRenderer(this, 5, 210);
        this.Mainbody1.setRotationPoint(0.0F, -19.0F, -10.0F);
        this.Mainbody1.addBox(-7.0F, 0.0F, 0.0F, 14, 17, 24, 0.0F);
        this.setRotateAngle(Mainbody1, -0.136659280431156F, 0.0F, 0.0F);
        this.Neck1spine = new MowzieModelRenderer(this, 190, 35);
        this.Neck1spine.setRotationPoint(0.0F, -3.8F, -12.61F);
        this.Neck1spine.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 6, 0.0F);
        this.setRotateAngle(Neck1spine, 0.27314402793711257F, 0.0F, 0.0F);
        this.Righttoesoleleft = new MowzieModelRenderer(this, 500, 240);
        this.Righttoesoleleft.setRotationPoint(0.01F, -2.7F, 1.9F);
        this.Righttoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Righttoesoleleft, -0.27314402793711257F, 0.0F, 0.0F);
        this.Lefttoesoleleft = new MowzieModelRenderer(this, 500, 240);
        this.Lefttoesoleleft.setRotationPoint(-0.01F, -2.3F, 3.0F);
        this.Lefttoesoleleft.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Lefttoesoleleft, -0.4379031093253773F, 0.0F, 0.0F);
        this.Uppermiddletoeright = new MowzieModelRenderer(this, 500, 220);
        this.Uppermiddletoeright.setRotationPoint(0.0F, 6.63F, 0.44F);
        this.Uppermiddletoeright.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(Uppermiddletoeright, -0.40980330836826856F, 0.0F, 0.0F);
        this.Fronthead1.addChild(this.Jawupper);
        this.Heelleft.addChild(this.Upperlefttoeleft_1);
        this.Lowerarmleft.addChild(this.Handleft);
        this.Lowerlegleft.addChild(this.Heelleft);
        this.Upperlefttoeright.addChild(this.Lowerlefttoeright);
        this.Fronthead1.addChild(this.Fronthead2);
        this.Jawupper.addChild(this.Teethupperleft);
        this.Tail4.addChild(this.Tail5);
        this.Lowermiddletoeleft.addChild(this.Middletoesoleleft);
        this.Thightleft.addChild(this.Upperlegbackleft);
        this.Thightleft.addChild(this.Upperlegfrontleft);
        this.Thighright.addChild(this.Upperlegbackright);
        this.Heelright.addChild(this.Upperlefttoeright);
        this.Tail5.addChild(this.Tailspine5);
        this.Mainbody2.addChild(this.Neck1);
        this.Upperarmright.addChild(this.Lowerarmright);
        this.Thighright.addChild(this.Upperlegfrontright);
        this.Lowermiddletoeright.addChild(this.Middletoesoleright);
        this.Mainbody2.addChild(this.Rightshoulder);
        this.Neck3.addChild(this.Neck3spine);
        this.Mainbody1.addChild(this.Tail1);
        this.Uppermiddletoeleft.addChild(this.Lowermiddletoeleft);
        this.Lowerarmright.addChild(this.Handright);
        this.Finger1middleleft.addChild(this.Finger2middleleft);
        this.Lowerlefttoeright.addChild(this.Lefttoesoleright);
        this.Mainbody2.addChild(this.Leftshoulder);
        this.Lowerlegright.addChild(this.Heelright);
        this.Head1.addChild(this.Fronthead1);
        this.Tail1.addChild(this.Tailspine1);
        this.Leftshoulder.addChild(this.Upperarmleft);
        this.Upperlegfrontright.addChild(this.Lowerlegright);
        this.Fronthead1.addChild(this.Browfrontright);
        this.Handleft.addChild(this.Finger1lowerleft);
        this.Handright.addChild(this.Finger1lowerright);
        this.Neck1.addChild(this.Neck2);
        this.shape98.addChild(this.Browbehindleft);
        this.Tail2.addChild(this.Tail3);
        this.Finger1upperleft.addChild(this.Finger2upperleft);
        this.Tail3.addChild(this.Tailspine3);
        this.Jawupper.addChild(this.Teethupperright);
        this.Heelright.addChild(this.Soleright);
        this.Neck3.addChild(this.Head1);
        this.Tail1.addChild(this.Tail2);
        this.Mainbody1.addChild(this.Mainbody2);
        this.Heelleft.addChild(this.Uppermiddletoeleft);
        this.Upperlefttoeleft.addChild(this.Lowerleftoeleft);
        this.Neck2.addChild(this.Neck2spine);
        this.Fronthead1.addChild(this.shape98);
        this.Jawlower.addChild(this.Teethlowerleft);
        this.Rightshoulder.addChild(this.Upperarmright);
        this.Upperrighttoeright.addChild(this.Lowerrighttoeright);
        this.Jawlower.addChild(this.Teethlowerright);
        this.Jawlower.addChild(this.Teethlowerfront);
        this.Handleft.addChild(this.Finger1upperleft);
        this.Heelleft.addChild(this.Upperlefttoeleft);
        this.Tail4.addChild(this.Tailspine4);
        this.Browfrontright.addChild(this.Browbehindright);
        this.Uppermiddletoeright.addChild(this.Lowermiddletoeright);
        this.Upperlegfrontleft.addChild(this.Lowerlegleft);
        this.Head1.addChild(this.Jawlower);
        this.Handright.addChild(this.Finger1upperright);
        this.Tail3.addChild(this.Tail4);
        this.Handright.addChild(this.Finger1middleright);
        this.Finger1middleright.addChild(this.Finger2middleright);
        this.Tail2.addChild(this.Tailspine2);
        this.Jawlower.addChild(this.Jawunderside);
        this.Handleft.addChild(this.Finger1middleleft);
        this.Lowerrighttoeright.addChild(this.Righttoesoleright);
        this.Upperlefttoeleft_1.addChild(this.Lowerrighttoeleft);
        this.Upperarmleft.addChild(this.Lowerarmleft);
        this.Mainbody1.addChild(this.Mainbody1spine);
        this.Heelleft.addChild(this.Soleleft);
        this.Finger1lowerleft.addChild(this.Finger2lowerleft);
        this.Neck2.addChild(this.Necklower);
        this.Finger1lowerright.addChild(this.Finger1lowerright_1);
        this.Jawupper.addChild(this.Teethupperfront);
        this.Heelright.addChild(this.Upperrighttoeright);
        this.Mainbody2.addChild(this.Mainbody2spine);
        this.Finger1upperright.addChild(this.Finger2upperright);
        this.Neck2.addChild(this.Neck3);
        this.Neck1.addChild(this.Neck1spine);
        this.Lowerleftoeleft.addChild(this.Righttoesoleleft);
        this.Lowerrighttoeleft.addChild(this.Lefttoesoleleft);
        this.Heelright.addChild(this.Uppermiddletoeright);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Thightleft.render(f5);
        this.Thighright.render(f5);
        this.Mainbody1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}