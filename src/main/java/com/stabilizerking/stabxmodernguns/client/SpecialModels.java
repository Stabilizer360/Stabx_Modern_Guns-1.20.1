package com.stabilizerking.stabxmodernguns.client;


import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public enum SpecialModels {
    //Now this big ass class will be responsible for registering special models

    //-----------------------------------------------------Pistols---------------------------------------------------------

    FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON ("gun/pistols/500magnum/500magnum_smith_and_wesson"),


    GLOCK_19_C ("gun/pistols/glocks/glock19c"),
    GLOCK_19_C_SLIDER ("gun/pistols/glocks/glock19c_slider_cover"),



    DESERT_EAGLE_MARK_14("gun/pistols/desert_eagle/desert_eagle_mark14"),
    DESERT_EAGLE_MARK_14_SLIDER("gun/pistols/desert_eagle/desert_eagle_mark14_slider"),


    COLT_M1911A1("gun/pistols/m1911a1/colt_m1911a1"),
    COLT_M1911A1_SLIDER("gun/pistols/m1911a1/colt_m1911a1_slider"),



    P226("gun/pistols/p226/p226"),
    P226_SLIDER("gun/pistols/p226/p226_slider"),

    HKUSP45("gun/pistols/usp45/hkusp45"),
    HKUSP45_SLIDER("gun/pistols/usp45/hkusp45_slider"),


    BAREETA67("gun/pistols/bareeta67/bareeta67"),
    BAREETA67_SLIDER("gun/pistols/bareeta67/bareeta67_slider"),



    //------------------------------------------------------------------------SMGs----------------------------------------------------------------------//

    MP5_CLASSIC("gun/smgs/mp5_classic/mp5_classic"),
    MP5_CLASSIC_IRONSIGHTS("gun/smgs/mp5_classic/mp5_classic_ironsights"),
    MP5_CLASSIC_IRONSIGHTS_MOUNT("gun/smgs/mp5_classic/mp5_classic_ironsights_mount"),
    MP5_CLASSIC_ADVANCED_MUZZLE("gun/smgs/mp5_classic/mp5_classic_advanced_muzzle"),
    MP5_CLASSIC_ADVANCED_SUPPRESSER("gun/smgs/mp5_classic/mp5_classic_advanced_suppressor"),
    MP5_CLASSIC_ANGLED_GRIP("gun/smgs/mp5_classic/mp5_classic_angled_grip"),
    MP5_CLASSIC_DEFAULT_STOCK("gun/smgs/mp5_classic/mp5_classic_default_stock"),
    MP5_CLASSIC_HEAVY_STOCK("gun/smgs/mp5_classic/mp5_classic_heavy_stock"),
    MP5_CLASSIC_LIGHT_STOCK("gun/smgs/mp5_classic/mp5_classic_light_stock"),
    MP5_CLASSIC_MEDIUM_STOCK("gun/smgs/mp5_classic/mp5_classic_medium_stock"),
    MP5_CLASSIC_ANTI_RECOIl_STOCK("gun/smgs/mp5_classic/mp5_classic_anti_recoil_stock"),
    MP5_CLASSIC_SKELETON_GRIP("gun/smgs/mp5_classic/mp5_classic_skeleton_grip"),
    MP5_CLASSIC_SUPPRESSOR("gun/smgs/mp5_classic/mp5_classic_suppressor"),
    MP5_CLASSIC_VERTICAL_GRIP("gun/smgs/mp5_classic/mp5_classic_vertical_grip"),
    MP5_CLASSIC_BOLT_RELEASE("gun/smgs/mp5_classic/mp5_classic_bolt_release"),




    STRIKER45("gun/smgs/striker45/striker45"),
    STRIKER45_ADVANCED_MUZZLE("gun/smgs/striker45/striker45_advanced_muzzle"),
    STRIKER45_ADVANCED_SUPPRESSOR("gun/smgs/striker45/striker45_advanced_suppressor"),

    STRIKER45_BOLT_RELEASE("gun/smgs/striker45/striker45_bolt_release"),
    STRIKER45_ANGLED_GRIP("gun/smgs/striker45/striker45_angled_grip"),
    STRIKER45_DEFAULT_STOCK("gun/smgs/striker45/striker45_default_stock"),
    STRIKER45_HEAVY_STOCK("gun/smgs/striker45/striker45_heavy_stock"),
    STRIKER45_LIGHT_STOCK("gun/smgs/striker45/striker45_light_stock"),
    STRIKER45_MEDIUM_STOCK("gun/smgs/striker45/striker45_medium_stock"),
    STRIKER45_ANTI_RECOIl_STOCK("gun/smgs/striker45/striker45_anti_recoil_stock"),
    STRIKER45_SKELETON_GRIP("gun/smgs/striker45/striker45_skeleton_grip"),
    STRIKER45_SUPPRESSOR("gun/smgs/striker45/striker45_suppressor"),
    STRIKER45_VERTICAL_GRIP("gun/smgs/striker45/striker45_vertical_grip"),




    MP40("gun/smgs/mp40/mp40"),
    MP40_CHARGING_HANDLE("gun/smgs/mp40/mp40_charging_handle"),





    TEC9("gun/smgs/tec9/tec9"),





    KRISS_VECTOR45("gun/smgs/vector45/kriss_vector45"),
    KRISS_VECTOR45_CHARGING_HANDLE("gun/smgs/vector45/kriss_vector45_charging_handle"),
    KRISS_VECTOR45_IRONSIGHTS("gun/smgs/vector45/kriss_vector45_ironsights"),
    KRISS_VECTOR45_IRONSIGHTS_MOUNT("gun/smgs/vector45/kriss_vector45_ironsights_mount"),
    KRISS_VECTOR45_ADVANCED_MUZZLE("gun/smgs/vector45/kriss_vector45_advanced_muzzle"),
    KRISS_VECTOR45_ADVANCED_SUPPRESSOR("gun/smgs/vector45/kriss_vector45_advanced_suppressor"),
    KRISS_VECTOR45_ANGLED_GRIP("gun/smgs/vector45/kriss_vector45_angled_grip"),
    KRISS_VECTOR45_DEFAULT_GRIP("gun/smgs/vector45/kriss_vector45_default_grip"),
    KRISS_VECTOR45_DEFAULT_STOCK("gun/smgs/vector45/kriss_vector45_default_stock"),
    KRISS_VECTOR45_HEAVY_STOCK("gun/smgs/vector45/kriss_vector45_heavy_stock"),
    KRISS_VECTOR45_LIGHT_STOCK("gun/smgs/vector45/kriss_vector45_light_stock"),
    KRISS_VECTOR45_MEDIUM_STOCK("gun/smgs/vector45/kriss_vector45_medium_stock"),
    KRISS_VECTOR45_ANTI_RECOIl_STOCK("gun/smgs/vector45/kriss_vector45_anti_recoil_stock"),
    KRISS_VECTOR45_SKELETON_GRIP("gun/smgs/vector45/kriss_vector45_skeleton_grip"),
    KRISS_VECTOR45_SUPPRESSOR("gun/smgs/vector45/kriss_vector45_suppressor"),
    KRISS_VECTOR45_VERTICAL_GRIP("gun/smgs/vector45/kriss_vector45_vertical_grip"),




    ZXR_MP7("gun/smgs/mp7/zxr_mp7"),
    ZXR_MP7_IRONSIGHTS("gun/smgs/mp7/zxr_mp7_ironsights"),
    ZXR_MP7_IRONSIGHTS_MOUNT("gun/smgs/mp7/zxr_mp7_ironsights_mount"),
    ZXR_MP7_ADVANCED_MUZZLE("gun/smgs/mp7/zxr_mp7_advanced_muzzle"),
    ZXR_MP7_ADVANCED_SUPPRESSOR("gun/smgs/mp7/zxr_mp7_advanced_suppressor"),
    ZXR_MP7_ANGLED_GRIP("gun/smgs/mp7/zxr_mp7_angled_grip"),
    ZXR_MP7_DEFAULT_MUZZLE("gun/smgs/mp7/zxr_mp7_default_muzzle"),
    ZXR_MP7_DEFAULT_STOCK("gun/smgs/mp7/zxr_mp7_default_stock"),
    ZXR_MP7_HEAVY_STOCK("gun/smgs/mp7/zxr_mp7_heavy_stock"),
    ZXR_MP7_LIGHT_STOCK("gun/smgs/mp7/zxr_mp7_light_stock"),
    ZXR_MP7_MEDIUM_STOCK("gun/smgs/mp7/zxr_mp7_medium_stock"),
    ZXR_MP7_ANTI_RECOIl_STOCK("gun/smgs/mp7/zxr_mp7_anti_recoil_stock"),
    ZXR_MP7_SKELETON_GRIP("gun/smgs/mp7/zxr_mp7_skeleton_grip"),
    ZXR_MP7_SUPPRESSOR("gun/smgs/mp7/zxr_mp7_suppressor"),
    ZXR_MP7_VERTICAL_GRIP("gun/smgs/mp7/zxr_mp7_vertical_grip"),


    RO678x("gun/smgs/ro678x/ro678x"),
    RO678x_IRONSIGHTS("gun/smgs/ro678x/ro678x_ironsights"),
    RO678x_IRONSIGHTS_MOUNT("gun/smgs/ro678x/ro678x_ironsights_mount"),
    RO678x_ADVANCED_MUZZLE("gun/smgs/ro678x/ro678x_advanced_muzzle"),
    RO678x_ADVANCED_SUPPRESSOR("gun/smgs/ro678x/ro678x_advanced_suppressor"),
    RO678x_ANGLED_GRIP("gun/smgs/ro678x/ro678x_angled_grip"),
    RO678x_DEFAULT_MUZZLE("gun/smgs/ro678x/ro678x_default_muzzle"),
    RO678x_DEFAULT_STOCK("gun/smgs/ro678x/ro678x_default_stock"),
    RO678x_HEAVY_STOCK("gun/smgs/ro678x/ro678x_heavy_stock"),
    RO678x_LIGHT_STOCK("gun/smgs/ro678x/ro678x_light_stock"),
    RO678x_MEDIUM_STOCK("gun/smgs/ro678x/ro678x_medium_stock"),
    RO678x_ANTI_RECOIl_STOCK("gun/smgs/ro678x/ro678x_anti_recoil_stock"),
    RO678x_SKELETON_GRIP("gun/smgs/ro678x/ro678x_skeleton_grip"),
    RO678x_SUPPRESSOR("gun/smgs/ro678x/ro678x_suppressor"),
    RO678x_VERTICAL_GRIP("gun/smgs/ro678x/ro678x_vertical_grip"),

    //--------------------------------------------------------------- Assault Rifles---------------------------------------------------------
    AK_47("gun/assault_rifles/aks/ak47/ak47"),
    AK_47_IRONSIGHTS("gun/assault_rifles/aks/ak47/ak47_ironsights"),
    AK_47_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/ak47/ak47_ironsights_mount"),
    AK_47_ADVANCED_MUZZLE("gun/assault_rifles/aks/ak47/ak47_advanced_muzzle"),
    AK_47_ANGLED_GRIP("gun/assault_rifles/aks/ak47/ak47_angled_grip"),
    AK_47_DEFAULT_MUZZLE("gun/assault_rifles/aks/ak47/ak47_default_muzzle"),
    AK_47_DEFAULT_STOCK("gun/assault_rifles/aks/ak47/ak47_default_stock"),
    AK_47_HEAVY_STOCK("gun/assault_rifles/aks/ak47/ak47_heavy_stock"),
    AK_47_LIGHT_STOCK("gun/assault_rifles/aks/ak47/ak47_light_stock"),
    AK_47_MEDIUM_STOCK("gun/assault_rifles/aks/ak47/ak47_medium_stock"),
    AK_47_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ak47/ak47_anti_recoil_stock"),
    AK_47_SKELETON_GRIP("gun/assault_rifles/aks/ak47/ak47_skeleton_grip"),
    AK_47_SUPPRESSOR("gun/assault_rifles/aks/ak47/ak47_suppressor"),
    AK_47_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/ak47/ak47_advanced_suppressor"),
    AK_47_VERTICAL_GRIP("gun/assault_rifles/aks/ak47/ak47_vertical_grip"),
    AK_47_CHARGING_HANDLE("gun/assault_rifles/aks/ak47/ak47_charging_handle"),









    AKM_762("gun/assault_rifles/aks/akm762/akm_762"),
    AKM_762_ADVANCED_MUZZLE("gun/assault_rifles/aks/akm762/akm_762_advanced_muzzle"),
    AKM_762_ANGLED_GRIP("gun/assault_rifles/aks/akm762/akm_762_angled_grip"),
    AKM_762_DEFAULT_MUZZLE("gun/assault_rifles/aks/akm762/akm_762_default_muzzle"),
    AKM_762_DEFAULT_STOCK("gun/assault_rifles/aks/akm762/akm_762_default_stock"),
    AKM_762_HEAVY_STOCK("gun/assault_rifles/aks/akm762/akm_762_heavy_stock"),
    AKM_762_LIGHT_STOCK("gun/assault_rifles/aks/akm762/akm_762_light_stock"),
    AKM_762_MEDIUM_STOCK("gun/assault_rifles/aks/akm762/akm_762_medium_stock"),
    AKM_762_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/akm762/akm_762_anti_recoil_stock"),
    AKM_762_SKELETON_GRIP("gun/assault_rifles/aks/akm762/akm_762_skeleton_grip"),
    AKM_762_SUPPRESSOR("gun/assault_rifles/aks/akm762/akm_762_suppressor"),
    AKM_762_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/akm762/akm_762_advanced_suppressor"),
    AKM_762_VERTICAL_GRIP("gun/assault_rifles/aks/akm762/akm_762_vertical_grip"),
    AKM_762_CHARGING_HANDLE("gun/assault_rifles/aks/akm762/akm_762_charging_handle"),



    AKx117("gun/assault_rifles/aks/akx117/akx117"),
    AKx117_IRONSIGHTS("gun/assault_rifles/aks/akx117/akx117_ironsights"),
    AKx117_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/akx117/akx117_ironsights_mount"),
    AKx117_ADVANCED_MUZZLE("gun/assault_rifles/aks/akx117/akx117_advanced_muzzle"),
    AKx117_ANGLED_GRIP("gun/assault_rifles/aks/akx117/akx117_angled_grip"),
    AKx117_DEFAULT_MUZZLE("gun/assault_rifles/aks/akx117/akx117_default_muzzle"),
    AKx117_DEFAULT_STOCK("gun/assault_rifles/aks/akx117/akx117_default_stock"),
    AKx117_HEAVY_STOCK("gun/assault_rifles/aks/akx117/akx117_heavy_stock"),
    AKx117_LIGHT_STOCK("gun/assault_rifles/aks/akx117/akx117_light_stock"),
    AKx117_MEDIUM_STOCK("gun/assault_rifles/aks/akx117/akx117_medium_stock"),
    AKx117_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/akx117/akx117_anti_recoil_stock"),
    AKx117_SKELETON_GRIP("gun/assault_rifles/aks/akx117/akx117_skeleton_grip"),
    AKx117_SUPPRESSOR("gun/assault_rifles/aks/akx117/akx117_suppressor"),
    AKx117_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/akx117/akx117_advanced_suppressor"),
    AKx117_VERTICAL_GRIP("gun/assault_rifles/aks/akx117/akx117_vertical_grip"),
    AKx117_CHARGING_HANDLE("gun/assault_rifles/aks/akx117/akx117_charging_handle"),



    AK_103("gun/assault_rifles/aks/ak_103/ak_103"),
    AK_103_ADVANCED_MUZZLE("gun/assault_rifles/aks/ak_103/ak_103_advanced_muzzle"),
    AK_103_ANGLED_GRIP("gun/assault_rifles/aks/ak_103/ak_103_angled_grip"),
    AK_103_DEFAULT_MUZZLE("gun/assault_rifles/aks/ak_103/ak_103_default_muzzle"),
    AK_103_DEFAULT_STOCK("gun/assault_rifles/aks/ak_103/ak_103_default_stock"),
    AK_103_HEAVY_STOCK("gun/assault_rifles/aks/ak_103/ak_103_heavy_stock"),
    AK_103_LIGHT_STOCK("gun/assault_rifles/aks/ak_103/ak_103_light_stock"),
    AK_103_MEDIUM_STOCK("gun/assault_rifles/aks/ak_103/ak_103_medium_stock"),
    AK_103_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ak_103/ak_103_anti_recoil_stock"),
    AK_103_SKELETON_GRIP("gun/assault_rifles/aks/ak_103/ak_103_skeleton_grip"),
    AK_103_SUPPRESSOR("gun/assault_rifles/aks/ak_103/ak_103_suppressor"),
    AK_103_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/ak_103/ak_103_advanced_suppressor"),
    AK_103_VERTICAL_GRIP("gun/assault_rifles/aks/ak_103/ak_103_vertical_grip"),

    AK_103_CHARGING_HANDLE("gun/assault_rifles/aks/ak_103/ak_103_charging_handle"),








    AKS_74UX("gun/assault_rifles/aks/aks74ux/aks74ux"),
    AKS_74UX_CHARGING_HANDLE("gun/assault_rifles/aks/aks74ux/aks74ux_charging_handle"),
    AKS_74UX_IRONSIGHTS("gun/assault_rifles/aks/aks74ux/aks74ux_ironsights"),
    AKS_74UX_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/aks74ux/aks74ux_ironsights_mount"),
    AKS_74UX_ADVANCED_MUZZLE("gun/assault_rifles/aks/aks74ux/aks74ux_advanced_muzzle"),
    AKS_74UX_ANGLED_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_angled_grip"),
    AKS_74UX_DEFAULT_MUZZLE("gun/assault_rifles/aks/aks74ux/aks74ux_default_muzzle"),
    AKS_74UX_HEAVY_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_heavy_stock"),
    AKS_74UX_LIGHT_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_light_stock"),
    AKS_74UX_MEDIUM_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_medium_stock"),
    AKS_74UX_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_anti_recoil_stock"),
    AKS_74UX_SKELETON_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_skeleton_grip"),
    AKS_74UX_SUPPRESSOR("gun/assault_rifles/aks/aks74ux/aks74ux_suppressor"),
    AKS_74UX_ADVACNED_SUPPRESSOR("gun/assault_rifles/aks/aks74ux/aks74ux_advanced_suppressor"),
    AKS_74UX_VERTICAL_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_vertical_grip"),









    AKS74("gun/assault_rifles/aks/aks74/aks74"),
    AKS74_CHARGING_HANDLE("gun/assault_rifles/aks/aks74/aks74_charging_handle"),
    AKS74_IRONSIGHTS("gun/assault_rifles/aks/aks74/aks74_ironsights"),
    AKS74_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/aks74/aks74_ironsights_mount"),
    AKS74_ADVANCED_MUZZLE("gun/assault_rifles/aks/aks74/aks74_advanced_muzzle"),
    AKS74_ANGLED_GRIP("gun/assault_rifles/aks/aks74/aks74_angled_grip"),
    AKS74_DEFAULT_MUZZLE("gun/assault_rifles/aks/aks74/aks74_default_muzzle"),
    AKS74_DEFAULT_STOCK("gun/assault_rifles/aks/aks74/aks74_default_stock"),
    AKS74_HEAVY_STOCK("gun/assault_rifles/aks/aks74/aks74_heavy_stock"),
    AKS74_LIGHT_STOCK("gun/assault_rifles/aks/aks74/aks74_light_stock"),
    AKS74_MEDIUM_STOCK("gun/assault_rifles/aks/aks74/aks74_medium_stock"),
    AKS74_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/aks74/aks74_anti_recoil_stock"),
    AKS74_SKELETON_GRIP("gun/assault_rifles/aks/aks74/aks74_skeleton_grip"),
    AKS74_SUPPRESSOR("gun/assault_rifles/aks/aks74/aks74_suppressor"),
    AKS74_VERTICAL_GRIP("gun/assault_rifles/aks/aks74/aks74_vertical_grip"),
    AKS74_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/aks74/aks74_advanced_suppressor"),



    RATNIK19("gun/assault_rifles/aks/ratnik19/ratnik19"),
    RATNIK19_ADVANCED_MUZZLE("gun/assault_rifles/aks/ratnik19/ratnik19_advanced_muzzle"),
    RATNIK19_ANGLED_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_angled_grip"),
    RATNIK19_DEFAULT_MUZZLE("gun/assault_rifles/aks/ratnik19/ratnik19_default_muzzle"),
    RATNIK19_DEFAULT_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_default_stock"),
    RATNIK19_HEAVY_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_heavy_stock"),
    RATNIK19_LIGHT_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_light_stock"),
    RATNIK19_MEDIUM_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_medium_stock"),
    RATNIK19_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_anti_recoil_stock"),
    RATNIK19_SKELETON_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_skeleton_grip"),
    RATNIK19_SUPPRESSOR("gun/assault_rifles/aks/ratnik19/ratnik19_suppressor"),
    RATNIK19_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/ratnik19/ratnik19_advanced_suppressor"),
    RATNIK19_VERTICAL_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_vertical_grip"),
    RATNIK19_CHARGING_HANDLE("gun/assault_rifles/aks/ratnik19/ratnik19_charging_handle"),




    GK57("gun/assault_rifles/aks/gk57/gk57"),
    GK57_CHARGING_HANDLE("gun/assault_rifles/aks/gk57/gk57_charging_handle"),
    GK57_IRONSIGHTS("gun/assault_rifles/aks/gk57/gk57_ironsights"),
    GK57_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/gk57/gk57_ironsights_mount"),
    GK57_ADVANCED_MUZZLE("gun/assault_rifles/aks/gk57/gk57_advanced_muzzle"),
    GK57_ANGLED_GRIP("gun/assault_rifles/aks/gk57/gk57_angled_grip"),
    GK57_DEFAULT_MUZZLE("gun/assault_rifles/aks/gk57/gk57_default_muzzle"),
    GK57_DEFAULT_STOCK("gun/assault_rifles/aks/gk57/gk57_default_stock"),
    GK57_HEAVY_STOCK("gun/assault_rifles/aks/gk57/gk57_heavy_stock"),
    GK57_LIGHT_STOCK("gun/assault_rifles/aks/gk57/gk57_light_stock"),
    GK57_MEDIUM_STOCK("gun/assault_rifles/aks/gk57/gk57_medium_stock"),
    GK57_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/gk57/gk57_anti_recoil_stock"),
    GK57_SKELETON_GRIP("gun/assault_rifles/aks/gk57/gk57_skeleton_grip"),
    GK57_SUPPRESSOR("gun/assault_rifles/aks/gk57/gk57_suppressor"),
    GK57_ADVANCED_SUPPRESSOR("gun/assault_rifles/aks/gk57/gk57_advanced_suppressor"),
    GK57_VERTICAL_GRIP("gun/assault_rifles/aks/gk57/gk57_vertical_grip"),





    M16("gun/assault_rifles/m4s/m16/m16"),
    M16_IRONSIGHTS("gun/assault_rifles/m4s/m16/m16_iron_sights"),
    M16_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m16/m16_ironsights_mount"),
    M16_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m16/m16_advanced_muzzle"),
    M16_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/m16/m16_advanced_suppressor"),
    M16_ANGLED_GRIP("gun/assault_rifles/m4s/m16/m16_angled_grip"),
    M16_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m16/m16_default_muzzle"),
    M16_DEFAULT_STOCK("gun/assault_rifles/m4s/m16/m16_default_stock"),
    M16_HEAVY_STOCK("gun/assault_rifles/m4s/m16/m16_heavy_stock"),
    M16_LIGHT_STOCK("gun/assault_rifles/m4s/m16/m16_light_stock"),
    M16_MEDIUM_STOCK("gun/assault_rifles/m4s/m16/m16_medium_stock"),
    M16_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m16/m16_anti_recoil_stock"),
    M16_SKELETON_GRIP("gun/assault_rifles/m4s/m16/m16_skeleton_grip"),
    M16_SUPPRESSOR("gun/assault_rifles/m4s/m16/m16_suppressor"),
    M16_VERTICAL_GRIP("gun/assault_rifles/m4s/m16/m16_vertical_grip"),



    M4A1("gun/assault_rifles/m4s/m4a1/m4a1"),
    M4A1_IRONSIGHTS("gun/assault_rifles/m4s/m4a1/m4a1_ironsights"),
    M4A1_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m4a1/m4a1_ironsights_mount"),
    M4A1_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m4a1/m4a1_advanced_muzzle"),
    M4A1_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/m4a1/m4a1_advanced_suppressor"),
    M4A1_ANGLED_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_angled_grip"),
    M4A1_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m4a1/m4a1_default_muzzle"),
    M4A1_DEFAULT_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_default_stock"),
    M4A1_HEAVY_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_heavy_stock"),
    M4A1_LIGHT_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_light_stock"),
    M4A1_MEDIUM_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_medium_stock"),
    M4A1_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_anti_recoil_stock"),
    M4A1_SKELETON_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_skeleton_grip"),
    M4A1_SUPPRESSOR("gun/assault_rifles/m4s/m4a1/m4a1_suppressor"),
    M4A1_VERTICAL_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_vertical_grip"),









    ACR("gun/assault_rifles/acr/acr_360_bushmaster"),
    ACR_IRONSIGHTS("gun/assault_rifles/acr/acr_360_bushmaster_iron_sights"),
    ACR_IRONSIGHTS_MOUNT("gun/assault_rifles/acr/acr_360_bushmaster_iron_sights_mount"),
    ACR_ADVANCED_MUZZLE("gun/assault_rifles/acr/acr_360_bushmaster_advanced_muzzle"),
    ACR_ADVANCED_SUPPRESSOR("gun/assault_rifles/acr/acr_360_bushmaster_advanced_suppressor"),
    ACR_ANGLED_GRIP("gun/assault_rifles/acr/acr_360_bushmaster_angled_grip"),
    ACR_DEFAULT_MUZZLE("gun/assault_rifles/acr/acr_360_bushmaster_default_muzzle"),
    ACR_DEFAULT_STOCK("gun/assault_rifles/acr/acr_360_bushmaster_default_stock"),
    ACR_HEAVY_STOCK("gun/assault_rifles/acr/acr_360_bushmaster_heavy_stock"),
    ACR_LIGHT_STOCK("gun/assault_rifles/acr/acr_360_bushmaster_light_stock"),
    ACR_MEDIUM_STOCK("gun/assault_rifles/acr/acr_360_bushmaster_medium_stock"),
    ACR_ANTI_RECOIl_STOCK("gun/assault_rifles/acr/acr_360_bushmaster_anti_recoil_stock"),
    ACR_SKELETON_GRIP("gun/assault_rifles/acr/acr_360_bushmaster_skeleton_grip"),
    ACR_SUPPRESSOR("gun/assault_rifles/acr/acr_360_bushmaster_suppressor"),
    ACR_VERTICAL_GRIP("gun/assault_rifles/acr/acr_360_bushmaster_vertical_grip"),
    ACR_BOLT_RELEASE("gun/assault_rifles/acr/acr_360_bushmaster_bolt_release"),









    M4("gun/assault_rifles/m4s/m4/m4"),
    M4_IRONSIGHTS("gun/assault_rifles/m4s/m4/m4_ironsights"),
    M4_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m4/m4_ironsights_mount"),
    M4_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m4/m4_advanced_muzzle"),
    M4_ANGLED_GRIP("gun/assault_rifles/m4s/m4/m4_angled_grip"),
    M4_BOLT_RELEASE("gun/assault_rifles/m4s/m4/m4_bolt_release"),
    M4_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m4/m4_default_muzzle"),
    M4_DEFAULT_STOCK("gun/assault_rifles/m4s/m4/m4_default_stock"),
    M4_HEAVY_STOCK("gun/assault_rifles/m4s/m4/m4_heavy_stock"),
    M4_LIGHT_STOCK("gun/assault_rifles/m4s/m4/m4_light_stock"),
    M4_MEDIUM_STOCK("gun/assault_rifles/m4s/m4/m4_medium_stock"),
    M4_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m4/m4_anti_recoil_stock"),
    M4_SKELETON_GRIP("gun/assault_rifles/m4s/m4/m4_skeleton_grip"),
    M4_SUPPRESSOR("gun/assault_rifles/m4s/m4/m4_suppressor"),
    M4_VERTICAL_GRIP("gun/assault_rifles/m4s/m4/m4_vertical_grip"),



    SCAR_17("gun/assault_rifles/scar/scar17"),
    SCAR_17_CHARGING_HANDLE("gun/assault_rifles/scar/scar17_charging_handle"),
    SCAR_17_IRONSIGHTS("gun/assault_rifles/scar/scar17_ironsights"),
    SCAR_17_IRONSIGHTS_MOUNT("gun/assault_rifles/scar/scar17_ironsights_mount"),
    SCAR_17_ADVANCED_MUZZLE("gun/assault_rifles/scar/scar17_advanced_muzzle"),
    SCAR_17_ADVANCED_SUPPRESSOR("gun/assault_rifles/scar/scar17_advanced_suppressor"),
    SCAR_17_ANGLED_GRIP("gun/assault_rifles/scar/scar17_angled_grip"),
    SCAR_17_DEFAULT_MUZZLE("gun/assault_rifles/scar/scar17_default_muzzle"),
    SCAR_17_DEFAULT_STOCK("gun/assault_rifles/scar/scar17_default_stock"),
    SCAR_17_LIGHT_STOCK("gun/assault_rifles/scar/scar17_light_stock"),
    SCAR_17_MEDIUM_STOCK("gun/assault_rifles/scar/scar17_medium_stock"),
    SCAR_17_HEAVY_STOCK("gun/assault_rifles/scar/scar17_heavy_stock"),
    SCAR_17_ANTI_RECOIl_STOCK("gun/assault_rifles/scar/scar17_anti_recoil_stock"),
    SCAR_17_SKELETON_GRIP("gun/assault_rifles/scar/scar17_skeleton_grip"),
    SCAR_17_SUPPRESSOR("gun/assault_rifles/scar/scar17_suppressor"),
    SCAR_17_VERTICAL_GRIP("gun/assault_rifles/scar/scar17_vertical_grip"),






    HCAR762("gun/dmrs/hcar/hcar762"),
    HCAR762_CHARGING_HANDLE("gun/dmrs/hcar/hcar762_charging_handle"),
    HCAR762_IRONSIGHTS("gun/dmrs/hcar/hcar762_ironsights"),
    HCAR762_IRONSIGHTS_MOUNT("gun/dmrs/hcar/hcar762_ironsights_mount"),
    HCAR762_ADVANCED_MUZZLE("gun/dmrs/hcar/hcar762_advanced_muzzle"),
    HCAR762_ADVANCED_SUPPRESSOR("gun/dmrs/hcar/hcar762_advanced_suppressor"),
    HCAR762_ANGLED_GRIP("gun/dmrs/hcar/hcar762_angled_grip"),
    HCAR762_DEFAULT_MUZZLE("gun/dmrs/hcar/hcar762_default_muzzle"),
    HCAR762_SKELETON_GRIP("gun/dmrs/hcar/hcar762_skeleton_grip"),
    HCAR762_SUPPRESSOR("gun/dmrs/hcar/hcar762_suppressor"),
    HCAR762_VERTICAL_GRIP("gun/dmrs/hcar/hcar762_vertical_grip"),








    FAMAS_G7("gun/assault_rifles/famas/famas_g7"),
    FAMAS_G7_CHARGING_HANDLE("gun/assault_rifles/famas/famas_g7_charging_handle"),
    FAMAS_G7_IRONSIGHTS_MOUNT("gun/assault_rifles/famas/famas_g7_ironsights_mount"),
    FAMAS_G7_IRONSIGHTS("gun/assault_rifles/famas/famas_g7_ironsights"),
    FAMAS_G7_ADVANCED_MUZZLE("gun/assault_rifles/famas/famas_g7_advanced_muzzle"),
    FAMAS_G7_ADVANCED_SUPPRESSOR("gun/assault_rifles/famas/famas_g7_advanced_suppressor"),
    FAMAS_G7_ANGLED_GRIP("gun/assault_rifles/famas/famas_g7_angled_grip"),
    FAMAS_G7_BOLT_RELEASE("gun/assault_rifles/famas/famas_g7_bolt_release"),
    FAMAS_G7_DEFAULT_MUZZLE("gun/assault_rifles/famas/famas_g7_default_muzzle"),
    FAMAS_G7_HEAVY_STOCK("gun/assault_rifles/famas/famas_g7_heavy_stock"),
    FAMAS_G7_LIGHT_STOCK("gun/assault_rifles/famas/famas_g7_light_stock"),
    FAMAS_G7_MEDIUM_STOCK("gun/assault_rifles/famas/famas_g7_medium_stock"),
    FAMAS_G7_ANTI_RECOIl_STOCK("gun/assault_rifles/famas/famas_g7_anti_recoil_stock"),
    FAMAS_G7_SKELETON_GRIP("gun/assault_rifles/famas/famas_g7_skeleton_grip"),
    FAMAS_G7_SUPPRESSOR("gun/assault_rifles/famas/famas_g7_suppressor"),
    FAMAS_G7_VERTICAL_GRIP("gun/assault_rifles/famas/famas_g7_vertical_grip"),







    AUG556("gun/assault_rifles/aug/aug556"),
    AUG556_IRONSIGHTS_MOUNT("gun/assault_rifles/aug/aug556_ironsights_mount"),
    AUG556_IRONSIGHTS("gun/assault_rifles/aug/aug556_ironsights"),
    AUG556_ADVANCED_MUZZLE("gun/assault_rifles/aug/aug556_advanced_muzzle"),
    AUG556_ADVANCED_SUPPRESSOR("gun/assault_rifles/aug/aug556_advanced_suppressor"),
    AUG556_ANGLED_GRIP("gun/assault_rifles/aug/aug556_angled_grip"),
    AUG556_BOLT_RELEASE("gun/assault_rifles/aug/aug556_bolt_release"),
    AUG556_DEFAULT_MUZZLE("gun/assault_rifles/aug/aug556_default_muzzle"),
    AUG556_DEFAULT_STOCK("gun/assault_rifles/aug/aug556_default_stock"),
    AUG556_HEAVY_STOCK("gun/assault_rifles/aug/aug556_heavy_stock"),
    AUG556_LIGHT_STOCK("gun/assault_rifles/aug/aug556_light_stock"),
    AUG556_MEDIUM_STOCK("gun/assault_rifles/aug/aug556_medium_stock"),
    AUG556_ANTI_RECOIl_STOCK("gun/assault_rifles/aug/aug556_anti_recoil_stock"),
    AUG556_SKELETON_GRIP("gun/assault_rifles/aug/aug556_skeleton_grip"),
    AUG556_SUPPRESSOR("gun/assault_rifles/aug/aug556_suppressor"),
    AUG556_VERTICAL_GRIP("gun/assault_rifles/aug/aug556_vertical_grip"),
    AUG556_DEFAULT_GRIP("gun/assault_rifles/aug/aug556_default_grip"),








    MCX_HONEYBADGER("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger"),
    MCX_HONEYBADGER_IRONSIGHTS("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_iron_sights"),
    MCX_HONEYBADGER_IRONSIGHTS_MOUNT("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_iron_sights_mount"),
    MCX_HONEYBADGER_ADVANCED_MUZZLE("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_advanced_muzzle"),
    MCX_HONEYBADGER_ADVANCED_SUPPRESSOR("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_advanced_suppressor"),
    MCX_HONEYBADGER_ANGLED_GRIP("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_angled_grip"),
    MCX_HONEYBADGER_DEFAULT_STOCK("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_default_stock"),
    MCX_HONEYBADGER_LIGHT_STOCK("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_light_stock"),
    MCX_HONEYBADGER_MEDIUM_STOCK("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_medium_stock"),
    MCX_HONEYBADGER_HEAVY_STOCK("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_heavy_stock"),
    MCX_HONEYBADGER_ANTI_RECOIl_STOCK("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_anti_recoil_stock"),
    MCX_HONEYBADGER_SKELETON_GRIP("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_skeleton_grip"),
    MCX_HONEYBADGER_SUPPRESSOR("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_suppressor"),
    MCX_HONEYBADGER_VERTICAL_GRIP("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_vertical_grip"),





    MK_MOD11("gun/assault_rifles/mkmod11/mkmod11"),
    MK_MOD11_CHARGING_HANDLE("gun/assault_rifles/mkmod11/mkmod11_charging_handle"),
    MK_MOD11_IRONSIGHTS("gun/assault_rifles/mkmod11/mkmod11_ironsights"),
    MK_MOD11_IRONSIGHTS_MOUNT("gun/assault_rifles/mkmod11/mkmod11_ironsights_mount"),






    HK416("gun/assault_rifles/m4s/hk416/hk416"),
    HK416_IRONSIGHTS("gun/assault_rifles/m4s/hk416/hk416_ironsights"),
    HK416_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/hk416/hk416_ironsights_mount"),
    HK416_ADVANCED_MUZZLE("gun/assault_rifles/m4s/hk416/hk416_advanced_muzzle"),
    HK416_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/hk416/hk416_advanced_suppressor"),
    HK416_ANGLED_GRIP("gun/assault_rifles/m4s/hk416/hk416_angled_grip"),
    HK416_DEFAULT_MUZZLE("gun/assault_rifles/m4s/hk416/hk416_default_muzzle"),
    HK416_DEFAULT_STOCK("gun/assault_rifles/m4s/hk416/hk416_default_stock"),
    HK416_HEAVY_STOCK("gun/assault_rifles/m4s/hk416/hk416_heavy_stock"),
    HK416_LIGHT_STOCK("gun/assault_rifles/m4s/hk416/hk416_light_stock"),
    HK416_MEDIUM_STOCK("gun/assault_rifles/m4s/hk416/hk416_medium_stock"),
    HK416_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/hk416/hk416_anti_recoil_stock"),
    HK416_SKELETON_GRIP("gun/assault_rifles/m4s/hk416/hk416_skeleton_grip"),
    HK416_SUPPRESSOR("gun/assault_rifles/m4s/hk416/hk416_suppressor"),
    HK416_VERTICAL_GRIP("gun/assault_rifles/m4s/hk416/hk416_vertical_grip"),





    G36C_HD("gun/assault_rifles/g36/g36chd"),
    G36C_HD_CHARGING_HANDLE("gun/assault_rifles/g36/g36chd_charging_handle"),
    G36C_HD_ADVANCED_MUZZLE("gun/assault_rifles/g36/g36chd_advanced_muzzle"),
    G36C_HD_ADVANCED_SUPPRESSOR("gun/assault_rifles/g36/g36chd_advanced_suppressor"),
    G36C_HD_ANGLED_GRIP("gun/assault_rifles/g36/g36chd_angled_grip"),
    G36C_HD_DEFAULT_MUZZLE("gun/assault_rifles/g36/g36chd_default_muzzle"),
    G36C_HD_DEFAULT_STOCK("gun/assault_rifles/g36/g36chd_default_stock"),
    G36C_HD_HEAVY_STOCK("gun/assault_rifles/g36/g36chd_heavy_stock"),
    G36C_HD_LIGHT_STOCK("gun/assault_rifles/g36/g36chd_light_stock"),
    G36C_HD_MEDIUM_STOCK("gun/assault_rifles/g36/g36chd_medium_stock"),
    G36C_HD_ANTI_RECOIl_STOCK("gun/assault_rifles/g36/g36chd_anti_recoil_stock"),
    G36C_HD_SKELETON_GRIP("gun/assault_rifles/g36/g36chd_skeleton_grip"),
    G36C_HD_SUPPRESSOR("gun/assault_rifles/g36/g36chd_suppressor"),
    G36C_HD_VERTICAL_GRIP("gun/assault_rifles/g36/g36chd_vertical_grip"),




    NZ41("gun/assault_rifles/nz41/nz41"),
    NZ41_CHARGING_HANDLE("gun/assault_rifles/nz41/nz41_charging_handle"),
    NZ41_IRONSIGHTS("gun/assault_rifles/nz41/nz41_ironsights"),
    NZ41_IRONSIGHTS_MOUNT("gun/assault_rifles/nz41/nz41_ironsights_mount"),







    AZ67("gun/assault_rifles/m4s/az67/az67"),
    AZ67_IRONSIGHTS("gun/assault_rifles/m4s/az67/az67_ironsights"),
    AZ67_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/az67/az67_ironsights_mount"),
    AZ67_ADVANCED_MUZZLE("gun/assault_rifles/m4s/az67/az67_advanced_muzzle"),
    AZ67_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/az67/az67_advanced_suppressor"),
    AZ67_ANGLED_GRIP("gun/assault_rifles/m4s/az67/az67_angled_grip"),
    AZ67_DEFAULT_STOCK("gun/assault_rifles/m4s/az67/az67_default_stock"),
    AZ67_HEAVY_STOCK("gun/assault_rifles/m4s/az67/az67_heavy_stock"),
    AZ67_LIGHT_STOCK("gun/assault_rifles/m4s/az67/az67_light_stock"),
    AZ67_MEDIUM_STOCK("gun/assault_rifles/m4s/az67/az67_medium_stock"),
    AZ67_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/az67/az67_anti_recoil_stock"),
    AZ67_SKELETON_GRIP("gun/assault_rifles/m4s/az67/az67_skeleton_grip"),
    AZ67_SUPPRESSOR("gun/assault_rifles/m4s/az67/az67_suppressor"),
    AZ67_VERTICAL_GRIP("gun/assault_rifles/m4s/az67/az67_vertical_grip"),







    STG_44("gun/assault_rifles/stg/stg44"),
    STG_44_CHARGING_HANDLE("gun/assault_rifles/stg/stg44_charging_handle"),
    STG_44_IRONSIGHTS("gun/assault_rifles/stg/stg44_ironsights"),
    STG_44_IRONSIGHTS_MOUNT("gun/assault_rifles/stg/stg44_ironsights_mount"),








//---------------------------------------------------------------------------Rifles-------------------------------------------

    M1_GRANDE("gun/rifles/m1_garands/m1_grande"),
    M1_GARAND_CHAGING_HANDLE("gun/rifles/m1_garands/m1_grande_charging_handle"),
    M1_GRANDE_IRONSIGHTS("gun/rifles/m1_garands/m1_grande_ironsights"),
    M1_GRANDE_IRONSIGHTS_MOUNT("gun/rifles/m1_garands/m1_grande_ironsights_mount"),


    KAR98K("gun/rifles/kar98k/kar98k"),
    KAR98k_BOLT("gun/rifles/kar98k/kar98k_bolt"),
    KAR98K_IRONSIGHTS("gun/rifles/kar98k/kar98k_ironsights"),
    KAR98K_IRONSIGHTS_MOUNT("gun/rifles/kar98k/kar98k_ironsights_mount"),


    M1_GARAND_REMAKE("gun/rifles/m1_garands/m1_garand_remake"),
    M1_GARAND_REMAKE_CHARGING_HANDLE("gun/rifles/m1_garands/m1_garand_remake_charging_handle"),
    M1_GARAND_REMAKE_IRONSIGHTS("gun/rifles/m1_garands/m1_garand_remake_ironsights"),
    M1_GARAND_REMAKE_IRONSIGHTS_MOUNT("gun/rifles/m1_garands/m1_garand_remake_ironsights_mount"),





    ARISAKA_TYPE_99("gun/rifles/arisaka/arisaka_type99"),
    ARISAKA_TYPE_99_BOLT("gun/rifles/arisaka/arisaka_type99_bolt"),
    ARISAKA_TYPE_99_IRONSIGHTS("gun/rifles/arisaka/arisaka_type99_ironsights"),
    ARISAKA_TYPE_99_IRONSIGHTS_MOUNT("gun/rifles/arisaka/arisaka_type99_ironsights_mount"),



//---------------------------------------------------------Sniper Rifles----------------------------------------------------------------------------

    BARRETT_M82("gun/sniper_rifles/m82/barrett_m82_sniper"),
    BARRETT_M82_CHARGING_HANDLE("gun/sniper_rifles/m82/barrett_m82_sniper_charging_handle"),
    BARRETT_M82_IRONSIGHTS("gun/sniper_rifles/m82/barrett_m82_sniper_ironsights"),
    BARRETT_M82_IRONSIGHTS_MOUNT("gun/sniper_rifles/m82/barrett_m82_sniper_ironsights_mount"),
    BARRETT_M82_ANGLED_GRIP("gun/sniper_rifles/m82/barrett_m82_sniper_angled_grip"),
    BARRETT_M82_DEFAULT_STOCK("gun/sniper_rifles/m82/barrett_m82_sniper_default_stock"),
    BARRETT_M82_HEAVY_STOCK("gun/sniper_rifles/m82/barrett_m82_sniper_heavy_stock"),
    BARRETT_M82_LIGHT_STOCK("gun/sniper_rifles/m82/barrett_m82_sniper_light_stock"),
    BARRETT_M82_MEDIUM_STOCK("gun/sniper_rifles/m82/barrett_m82_sniper_medium_stock"),
    BARRETT_M82_ANTI_RECOIl_STOCK("gun/sniper_rifles/m82/barrett_m82_sniper_anti_recoil_stock"),
    BARRETT_M82_SKELETON_GRIP("gun/sniper_rifles/m82/barrett_m82_sniper_skeleton_grip"),
    BARRETT_M82_DEFAULT_GRIP("gun/sniper_rifles/m82/barrett_m82_sniper_default_grip"),
    BARRETT_M82_VERTICAL_GRIP("gun/sniper_rifles/m82/barrett_m82_sniper_vertical_grip"),



    SPR("gun/sniper_rifles/spr/spr3608"),
    SPR_BOLT("gun/sniper_rifles/spr/spr3608_bolt"),
    SPR_ADVANCED_MUZZLE("gun/sniper_rifles/spr/spr3608_advanced_muzzle"),
    SPR_ADVANCED_SUPPRESSOR("gun/sniper_rifles/spr/spr3608_advanced_suppressor"),
    SPR_ANGLED_GRIP("gun/sniper_rifles/spr/spr3608_angled_grip"),
    SPR_DEFAULT_STOCK("gun/sniper_rifles/spr/spr3608_default_stock"),
    SPR_HEAVY_STOCK("gun/sniper_rifles/spr/spr3608_heavy_stock"),
    SPR_LIGHT_STOCK("gun/sniper_rifles/spr/spr3608_light_stock"),
    SPR_MEDIUM_STOCK("gun/sniper_rifles/spr/spr3608_medium_stock"),
    SPR_ANTI_RECOIl_STOCK("gun/sniper_rifles/spr/spr3608_anti_recoil_stock"),
    SPR_SKELETON_GRIP("gun/sniper_rifles/spr/spr3608_skeleton_grip"),
    SPR_SUPPRESSOR("gun/sniper_rifles/spr/spr3608_suppressor"),
    SPR_VERTICAL_GRIP("gun/sniper_rifles/spr/spr3608_vertical_grip"),


    DRAGNAOV_SVD("gun/sniper_rifles/svd_dragnaov/dragnaov_svd"),
    DRAGNAOV_SVD_CHARGING_HANDLE("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_charging_handle"),
    DRAGNAOV_SVD_IRONSIGHTS("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_ironsights"),
    DRAGNAOV_SVD_IRONSIGHTS_MOUNT("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_ironsights_mount"),
    DRAGNAOV_SVD_ADVANCED_MUZZLE("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_advanced_muzzle"),
    DRAGNAOV_SVD_ADVANCED_SUPPRESSOR("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_advanced_suppressor"),
    DRAGNAOV_SVD_ANGLED_GRIP("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_angled_grip"),
    DRAGNAOV_SVD_DEFAULT_STOCK("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_default_stock"),
    DRAGNAOV_SVD_HEAVY_STOCK("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_heavy_stock"),
    DRAGNAOV_SVD_LIGHT_STOCK("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_light_stock"),
    DRAGNAOV_SVD_MEDIUM_STOCK("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_medium_stock"),
    DRAGNAOV_SVD_ANTI_RECOIl_STOCK("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_anti_recoil_stock"),
    DRAGNAOV_SVD_SKELETON_GRIP("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_skeleton_grip"),
    DRAGNAOV_SVD_SUPPRESSOR("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_suppressor"),
    DRAGNAOV_SVD_VERTICAL_GRIP("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_vertical_grip"),



    ARTIC_WARFARE_MAGNUM("gun/sniper_rifles/awm/artic_warfare_magnum"),
    ARTIC_WARFARE_MAGNUM_BOLT("gun/sniper_rifles/awm/artic_warfare_magnum_bolt"),
    ARTIC_WARFARE_MAGNUM_BOLT_CHAMBER("gun/sniper_rifles/awm/artic_warfare_magnum_bolt_chamber"),
    ARTIC_WARFARE_MAGNUM_ADVANCED_MUZZLE("gun/sniper_rifles/awm/artic_warfare_magnum_advanced_muzzle"),
    ARTIC_WARFARE_MAGNUM_ADVANCED_SUPPRESSOR("gun/sniper_rifles/awm/artic_warfare_magnum_advanced_suppressor"),
    ARTIC_WARFARE_MAGNUM_ANGLED_GRIP("gun/sniper_rifles/awm/artic_warfare_magnum_angled_grip"),
    ARTIC_WARFARE_MAGNUM_DEFAULT_STOCK("gun/sniper_rifles/awm/artic_warfare_magnum_default_stock"),
    ARTIC_WARFARE_MAGNUM_HEAVY_STOCK("gun/sniper_rifles/awm/artic_warfare_magnum_heavy_stock"),
    ARTIC_WARFARE_MAGNUM_LIGHT_STOCK("gun/sniper_rifles/awm/artic_warfare_magnum_light_stock"),
    ARTIC_WARFARE_MAGNUM_MEDIUM_STOCK("gun/sniper_rifles/awm/artic_warfare_magnum_medium_stock"),
    ARTIC_WARFARE_MAGNUM_ANTI_RECOIl_STOCK("gun/sniper_rifles/awm/artic_warfare_magnum_anti_recoil_stock"),
    ARTIC_WARFARE_MAGNUM_SKELETON_GRIP("gun/sniper_rifles/awm/artic_warfare_magnum_skeleton_grip"),
    ARTIC_WARFARE_MAGNUM_SUPPRESSOR("gun/sniper_rifles/awm/artic_warfare_magnum_suppressor"),
    ARTIC_WARFARE_MAGNUM_VERTICAL_GRIP("gun/sniper_rifles/awm/artic_warfare_magnum_vertical_grip"),






    REMINGTON360("gun/sniper_rifles/remington360/remington360"),
    REMINGTON360_BOLT("gun/sniper_rifles/remington360/remington360_bolt"),
    REMINGTON360_ADVANCED_MUZZLE("gun/sniper_rifles/remington360/remington360_advanced_muzzle"),
    REMINGTON360_ADVANCED_SUPPRESSOR("gun/sniper_rifles/remington360/remington360_advanced_suppressor"),
    REMINGTON360_ANGLED_GRIP("gun/sniper_rifles/remington360/remington360_angled_grip"),
    REMINGTON360_DEFAULT_STOCK("gun/sniper_rifles/remington360/remington360_default_stock"),
    REMINGTON360_HEAVY_STOCK("gun/sniper_rifles/remington360/remington360_heavy_stock"),
    REMINGTON360_LIGHT_STOCK("gun/sniper_rifles/remington360/remington360_light_stock"),
    REMINGTON360_MEDIUM_STOCK("gun/sniper_rifles/remington360/remington360_medium_stock"),
    REMINGTON360_ANTI_RECOIl_STOCK("gun/sniper_rifles/remington360/remington360_anti_recoil_stock"),
    REMINGTON360_SKELETON_GRIP("gun/sniper_rifles/remington360/remington360_skeleton_grip"),
    REMINGTON360_SUPPRESSOR("gun/sniper_rifles/remington360/remington360_suppressor"),
    REMINGTON360_VERTICAL_GRIP("gun/sniper_rifles/remington360/remington360_vertical_grip"),






    SVCH545("gun/sniper_rifles/svch545/svch545"),
    SVCH545_CHARGING_HANDLE("gun/sniper_rifles/svch545/svch545_charging_handle"),
    SVCH545_IRONSIGHTS("gun/sniper_rifles/svch545/svch545_ironsights"),
    SVCH545_IRONSIGHTS_MOUNT("gun/sniper_rifles/svch545/svch545_ironsights_mount"),
    SVCH545_ADVANCED_MUZZLE("gun/sniper_rifles/svch545/svch545_advanced_muzzle"),
    SVCH545_DEFAULT_MUZZLE("gun/sniper_rifles/svch545/svch545_default_muzzle"),
    SVCH545_ADVANCED_SUPPRESSOR("gun/sniper_rifles/svch545/svch545_advanced_suppressor"),
    SVCH545_ANGLED_GRIP("gun/sniper_rifles/svch545/svch545_angled_grip"),
    SVCH545_SKELETON_GRIP("gun/sniper_rifles/svch545/svch545_skeleton_grip"),
    SVCH545_SUPPRESSOR("gun/sniper_rifles/svch545/svch545_suppressor"),
    SVCH545_VERTICAL_GRIP("gun/sniper_rifles/svch545/svch545_vertical_grip"),

    //---------------------------------------------------------------------Marks Man Rifles Dmrs-------------------------------------------------

    SKS("gun/dmrs/sks/sks"),
    SKS_IRONSIGHTS("gun/dmrs/sks/sks_ironsights"),
    SKS_IRONSIGHTS_MOUNT("gun/dmrs/sks/sks_ironsights_mount"),
    SKS_CHARGING_HANDLE("gun/dmrs/sks/sks_charging_handle"),
    SKS_ADVANCED_MUZZLE("gun/dmrs/sks/sks_advanced_muzzle"),
    SKS_ADVANCED_SUPPRESSOR("gun/dmrs/sks/sks_advanced_suppressor"),
    SKS_ANGLED_GRIP("gun/dmrs/sks/sks_angled_grip"),
    SKS_DEFAULT_STOCK("gun/dmrs/sks/sks_default_stock"),
    SKS_HEAVY_STOCK("gun/dmrs/sks/sks_heavy_stock"),
    SKS_LIGHT_STOCK("gun/dmrs/sks/sks_light_stock"),
    SKS_MEDIUM_STOCK("gun/dmrs/sks/sks_medium_stock"),
    SKS_ANTI_RECOIl_STOCK("gun/dmrs/sks/sks_anti_recoil_stock"),
    SKS_SKELETON_GRIP("gun/dmrs/sks/sks_skeleton_grip"),
    SKS_SUPPRESSOR("gun/dmrs/sks/sks_suppressor"),
    SKS_VERTICAL_GRIP("gun/dmrs/sks/sks_vertical_grip"),




    M14("gun/dmrs/m14/m14"),
    M14_IRONSIGHTS("gun/dmrs/m14/m14_ironsights"),
    M14_IRONSIGHTS_MOUNT("gun/dmrs/m14/m14_ironsights_mount"),
    M14_CHARGING_HANDLE("gun/dmrs/m14/m14_charging_handle"),
    M14_ADVANCED_MUZZLE("gun/dmrs/m14/m14_advanced_muzzle"),
    M14_ADVANCED_SUPPRESSOR("gun/dmrs/m14/m14_advanced_suppressor"),
    M14_ANGLED_GRIP("gun/dmrs/m14/m14_angled_grip"),
    M14_HEAVY_STOCK("gun/dmrs/m14/m14_heavy_stock"),
    M14_LIGHT_STOCK("gun/dmrs/m14/m14_light_stock"),
    M14_MEDIUM_STOCK("gun/dmrs/m14/m14_medium_stock"),
    M14_ANTI_RECOIl_STOCK("gun/dmrs/m14/m14_anti_recoil_stock"),
    M14_SKELETON_GRIP("gun/dmrs/m14/m14_skeleton_grip"),
    M14_SUPPRESSOR("gun/dmrs/m14/m14_suppressor"),
    M14_VERTICAL_GRIP("gun/dmrs/m14/m14_vertical_grip"),



    //------------------------------------------------------------------------Light Machine Guns--------------------------------------------------------

    M60("gun/lmgs/m60/m60"),
    M60_IRONSIGHTS_FLIPPED("gun/lmgs/m60/m60_ironsights_flipped"),
    M60_CHARGING_HANDLE("gun/lmgs/m60/m60_charging_handle"),
    M60_IRONSIGHTS("gun/lmgs/m60/m60_ironsights"),
    M60_ADVANCED_MUZZLE("gun/lmgs/m60/m60_advanced_muzzle"),
    M60_ADVANCED_SUPPRESSOR("gun/lmgs/m60/m60_advanced_suppressor"),
    M60_ANGLED_GRIP("gun/lmgs/lmgs/m60/m60_angled_grip"),
    M60_SKELETON_GRIP("gun/lmgs/m60/m60_skeleton_grip"),
    M60_SUPPRESSOR("gun/lmgs/m60/m60_suppressor"),
    M60_VERTICAL_GRIP("gun/lmgs/m60/m60_vertical_grip"),


    BRUEN_MK9("gun/lmgs/bruen_mk9/bruen_mk9"),
    BRUEN_MK9_CHARGING_HANDLE("gun/lmgs/bruen_mk9/bruen_mk9_charging_handle"),
    BRUEN_MK9_IRONSIGHTS("gun/lmgs/bruen_mk9/bruen_mk9_ironsights"),
    BRUEN_MK9_IRONSIGHTS_MOUNT("gun/lmgs/bruen_mk9/bruen_mk9_ironsights_mount"),
    BRUEN_MK9_DEFAULT_MUZZLE("gun/lmgs/bruen_mk9/bruen_mk9_default_muzzle"),
    BRUEN_MK9_ADVANCED_MUZZLE("gun/lmgs/bruen_mk9/bruen_mk9_advanced_muzzle"),
    BRUEN_MK9_ADVANCED_SUPPRESSOR("gun/lmgs/bruen_mk9/bruen_mk9_advanced_suppressor"),
    BRUEN_MK9_ANGLED_GRIP("gun/lmgs/bruen_mk9/bruen_mk9_angled_grip"),
    BRUEN_MK9_SKELETON_GRIP("gun/lmgs/bruen_mk9/bruen_mk9_skeleton_grip"),
    BRUEN_MK9_SUPPRESSOR("gun/lmgs/bruen_mk9/bruen_mk9_suppressor"),
    BRUEN_MK9_VERTICAL_GRIP("gun/lmgs/bruen_mk9/bruen_mk9_vertical_grip"),




    RPK("gun/lmgs/rpk/rpk"),
    RPK_CHARGING_HANDLE("gun/lmgs/rpk/rpk_charging_handle"),
    RPK_IRONSIGHTS("gun/lmgs/rpk/rpk_ironsights"),
    RPK_IRONSIGHTS_MOUNT("gun/lmgs/rpk/rpk_ironsights_mount"),
    RPK_ADVANCED_MUZZLE("gun/lmgs/rpk/rpk_advanced_muzzle"),
    RPK_ADVANCED_SUPPRESSOR("gun/lmgs/rpk/rpk_advanced_suppressor"),
    RPK_ANGLED_GRIP("gun/lmgs/rpk/rpk_angled_grip"),
    RPK_DEFAULT_STOCK("gun/lmgs/rpk/rpk_default_stock"),
    RPK_HEAVY_STOCK("gun/lmgs/rpk/rpk_heavy_stock"),
    RPK_LIGHT_STOCK("gun/lmgs/rpk/rpk_light_stock"),
    RPK_MEDIUM_STOCK("gun/lmgs/rpk/rpk_medium_stock"),
    RPK_ANTI_RECOIl_STOCK("gun/lmgs/rpk/rpk_anti_recoil_stock"),
    RPK_SKELETON_GRIP("gun/lmgs/rpk/rpk_skeleton_grip"),
    RPK_SUPPRESSOR("gun/lmgs/rpk/rpk_suppressor"),
    RPK_VERTICAL_GRIP("gun/lmgs/rpk/rpk_vertical_grip"),


//--------------------------------------------------------------------Shot Guns-----------------------------------------------------------------------

    AA12UX("gun/shotguns/aa12ux/aa12ux"),
    AA12UX_IRONSIGHTS("gun/shotguns/aa12ux/aa12ux_ironsights"),
    AA12UX_IRONSIGHTS_MOUNT("gun/shotguns/aa12ux/aa12ux_ironsights_mount"),
    AA12UX_ADVANCED_MUZZLE("gun/shotguns/aa12ux/aa12ux_advanced_muzzle"),
    AA12UX_ADVANCED_SUPPRESSOR("gun/shotguns/aa12ux/aa12ux_advanced_suppressor"),
    AA12UX_ANGLED_GRIP("gun/shotguns/aa12ux/aa12ux_angled_grip"),
    AA12UX_HEAVY_STOCK("gun/shotguns/aa12ux/aa12ux_heavy_stock"),
    AA12UX_LIGHT_STOCK("gun/shotguns/aa12ux/aa12ux_light_stock"),
    AA12UX_MEDIUM_STOCK("gun/shotguns/aa12ux/aa12ux_medium_stock"),
    AA12UX_ANTI_RECOIl_STOCK("gun/shotguns/aa12ux/aa12ux_anti_recoil_stock"),
    AA12UX_SKELETON_GRIP("gun/shotguns/aa12ux/aa12ux_skeleton_grip"),
    AA12UX_SUPPRESSOR("gun/shotguns/aa12ux/aa12ux_suppressor"),
    AA12UX_VERTICAL_GRIP("gun/shotguns/aa12ux/aa12ux_vertical_grip"),


    BENELLIM4("gun/shotguns/benelli_m4/benelli_m4"),
    BENELLIM4_CHARGING_HANDLE("gun/shotguns/benelli_m4/benelli_m4_charging_handle"),
    BENELLIM4_ADVANCED_MUZZLE("gun/shotguns/benelli_m4/benelli_m4_advanced_muzzle"),
    BENELLIM4_ADVANCED_SUPPRESSOR("gun/shotguns/benelli_m4/benelli_m4_advanced_suppressor"),
    BENELLIM4_ANGLED_GRIP("gun/shotguns/benelli_m4/benelli_m4_angled_grip"),
    BENELLIM4_DEFAULT_STOCK("gun/shotguns/benelli_m4/benelli_m4_default_stock"),
    BENELLIM4_HEAVY_STOCK("gun/shotguns/benelli_m4/benelli_m4_heavy_stock"),
    BENELLIM4_LIGHT_STOCK("gun/shotguns/benelli_m4/benelli_m4_light_stock"),
    BENELLIM4_MEDIUM_STOCK("gun/shotguns/benelli_m4/benelli_m4_medium_stock"),
    BENELLIM4_ANTI_RECOIl_STOCK("gun/shotguns/benelli_m4/benelli_m4_anti_recoil_stock"),
    BENELLIM4_SKELETON_GRIP("gun/shotguns/benelli_m4/benelli_m4_skeleton_grip"),
    BENELLIM4_SUPPRESSOR("gun/shotguns/benelli_m4/benelli_m4_suppressor"),
    BENELLIM4_VERTICAL_GRIP("gun/shotguns/benelli_m4/benelli_m4_vertical_grip"),



    MOSSBERG500("gun/shotguns/mossberg/mossberg500"),
    MOSSBERG500_CHARGING_HANDLE("gun/shotguns/mossberg/mossberg500_charging_handle"),
    MOSSBERG500_IRONSIGHTS("gun/shotguns/mossberg/mossberg500_ironsights"),
    MOSSBERG500_IRONSIGHTS_MOUNT("gun/shotguns/mossberg/mossberg500_ironsights_mount"),
    MOSSBERG500_PUMP_ACTION("gun/shotguns/mossberg/mossberg500_pump_action"),
    MOSSBERG500_ADVANCED_MUZZLE("gun/shotguns/mossberg/mossberg500_advanced_muzzle"),
    MOSSBERG500_ADVANCED_SUPPRESSOR("gun/shotguns/mossberg/mossberg500_advanced_suppressor"),

    MOSSBERG500_HEAVY_STOCK("gun/shotguns/mossberg/mossberg500_heavy_stock"),
    MOSSBERG500_LIGHT_STOCK("gun/shotguns/mossberg/mossberg500_light_stock"),
    MOSSBERG500_MEDIUM_STOCK("gun/shotguns/mossberg/mossberg500_medium_stock"),
    MOSSBERG500_ANTI_RECOIl_STOCK("gun/shotguns/mossberg/mossberg500_anti_recoil_stock"),
    MOSSBERG500_SUPPRESSOR("gun/shotguns/mossberg/mossberg500_advanced_suppressor"),




    SUPER_SHORTY("gun/shotguns/shorty/serbu_super_shorty"),
    SUPER_SHORTY_CHARGING_HANDLE("gun/shotguns/shorty/serbu_super_shorty_charging_handle"),
    SUPER_SHORTY_IRONSIGHTS("gun/shotguns/shorty/serbu_super_shorty_ironsights"),
    SUPER_SHORTY_IRONSIGHTS_MOUNT("gun/shotguns/shorty/serbu_super_shorty_ironsights_mount"),
    SUPER_SHORTY_PUMP_ACTION("gun/shotguns/shorty/serbu_super_shorty_pumpaction"),
    SUPER_SHORTY_ADVANCED_MUZZLE("gun/shotguns/shorty/serbu_super_shorty_advanced_muzzle"),
    SUPER_SHORTY_ADVANCED_SUPPRESSOR("gun/shotguns/shorty/serbu_super_shorty_advanced_suppressor"),
    SUPER_SHORTY_SUPPRESSOR("gun/shotguns/shorty/serbu_super_shorty_advanced_suppressor"),



    SPAS_12("gun/shotguns/spas12/spas12"),
    SPAS_12_CHARGING_HANDLE("gun/shotguns/spas12/spas12_charging_handle"),
    SPAS_12_IRONSIGHTS("gun/shotguns/spas12/spas12_ironsights"),
    SPAS_12_IRONSIGHTS_MOUNT("gun/shotguns/spas12/spas12_ironsights_mount"),
    SPAS_12_ADVANCED_MUZZLE("gun/shotguns/spas12/spas12_advanced_muzzle"),
    SPAS_12_ADVANCED_SUPPRESSOR("gun/shotguns/spas12/spas12_advanced_suppressor"),
    SPAS_12_SUPPRESSOR("gun/shotguns/spas12/spas12_suppressor"),


//----------------------------------------------------------------Others ---------------------------------------------------------------------
    MK_170_CROSSBOW("gun/others/crossbow/mk_170_crossbow"),

    ;


    private final ResourceLocation modelLoc;
    private BakedModel cachedModel;

    SpecialModels(String modelName) {
        this.modelLoc = new ResourceLocation(StabxModernGuns.MOD_ID, "special/" + modelName);
    }

    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLoc);
        }
        return this.cachedModel;
    }
    @SubscribeEvent
    public static void onRegisterAdditionalModelEvent(final ModelEvent.RegisterAdditional event) {
        for (SpecialModels specialModel : values()) {
            event.register(specialModel.modelLoc);
        }
    }
    @SubscribeEvent
    public static void onBakingCompletedEvent(final ModelEvent.BakingCompleted event) {
        for (SpecialModels specialModel : values()) {
            specialModel.cachedModel = null;
        }
    }
}