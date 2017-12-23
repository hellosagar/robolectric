package org.robolectric;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.robolectric.internal.ShadowProvider;
import org.robolectric.shadow.api.Shadow;

/**
 * Shadow mapper. Automatically generated by the Robolectric Annotation Processor.
 */
@Generated("org.robolectric.annotation.processing.RobolectricProcessor")
@SuppressWarnings({"unchecked","deprecation"})
public class Shadows implements ShadowProvider {
  private static final Map<String, String> SHADOW_MAP = new HashMap<>(1);

  static {
    SHADOW_MAP.put("com.example.objects.Dummy", "org.robolectric.annotation.processing.shadows.ShadowExcludedFromAndroidSdk");
  }

  @Override
  public void reset() {
  }

  @Override
  public Map<String, String> getShadowMap() {
    return SHADOW_MAP;
  }

  @Override
  public String[] getProvidedPackageNames() {
    return new String[] {"com.example.objects"};
  }
}
