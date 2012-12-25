/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btWheelInfoConstructionInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btWheelInfoConstructionInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btWheelInfoConstructionInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btWheelInfoConstructionInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_chassisConnectionCS(btVector3 value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_chassisConnectionCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_chassisConnectionCS() {
    long cPtr = gdxBulletJNI.btWheelInfoConstructionInfo_m_chassisConnectionCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_wheelDirectionCS(btVector3 value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelDirectionCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_wheelDirectionCS() {
    long cPtr = gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelDirectionCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_wheelAxleCS(btVector3 value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelAxleCS_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_wheelAxleCS() {
    long cPtr = gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelAxleCS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_suspensionRestLength(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_suspensionRestLength_set(swigCPtr, this, value);
  }

  public float getM_suspensionRestLength() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_suspensionRestLength_get(swigCPtr, this);
  }

  public void setM_maxSuspensionTravelCm(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_maxSuspensionTravelCm_set(swigCPtr, this, value);
  }

  public float getM_maxSuspensionTravelCm() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_maxSuspensionTravelCm_get(swigCPtr, this);
  }

  public void setM_wheelRadius(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelRadius_set(swigCPtr, this, value);
  }

  public float getM_wheelRadius() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelRadius_get(swigCPtr, this);
  }

  public void setM_suspensionStiffness(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_suspensionStiffness_set(swigCPtr, this, value);
  }

  public float getM_suspensionStiffness() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_suspensionStiffness_get(swigCPtr, this);
  }

  public void setM_wheelsDampingCompression(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelsDampingCompression_set(swigCPtr, this, value);
  }

  public float getM_wheelsDampingCompression() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelsDampingCompression_get(swigCPtr, this);
  }

  public void setM_wheelsDampingRelaxation(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelsDampingRelaxation_set(swigCPtr, this, value);
  }

  public float getM_wheelsDampingRelaxation() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_wheelsDampingRelaxation_get(swigCPtr, this);
  }

  public void setM_frictionSlip(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_frictionSlip_set(swigCPtr, this, value);
  }

  public float getM_frictionSlip() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_frictionSlip_get(swigCPtr, this);
  }

  public void setM_maxSuspensionForce(float value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_maxSuspensionForce_set(swigCPtr, this, value);
  }

  public float getM_maxSuspensionForce() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_maxSuspensionForce_get(swigCPtr, this);
  }

  public void setM_bIsFrontWheel(boolean value) {
    gdxBulletJNI.btWheelInfoConstructionInfo_m_bIsFrontWheel_set(swigCPtr, this, value);
  }

  public boolean getM_bIsFrontWheel() {
    return gdxBulletJNI.btWheelInfoConstructionInfo_m_bIsFrontWheel_get(swigCPtr, this);
  }

  public btWheelInfoConstructionInfo() {
    this(gdxBulletJNI.new_btWheelInfoConstructionInfo(), true);
  }

}
