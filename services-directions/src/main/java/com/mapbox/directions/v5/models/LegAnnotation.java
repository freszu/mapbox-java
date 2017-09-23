package com.mapbox.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.Serializable;
import java.util.List;

/**
 * An annotations object that contains additional details about each line segment along the route
 * geometry. Each entry in an annotations field corresponds to a coordinate along the route
 * geometry.
 *
 * @since 2.1.0
 */
@AutoValue
public abstract class LegAnnotation implements Serializable {

  /**
   * Create a new instance of this class by using the {@link Builder} class.
   *
   * @return this classes {@link Builder} for creating a new instance
   * @since 3.0.0
   */
  public static Builder builder() {
    return new AutoValue_LegAnnotation.Builder();
  }

  /**
   * The distance, in meters, between each pair of coordinates.
   *
   * @return a list with each entry being a distance value between two of the routeLeg geometry
   *   coordinates
   * @since 2.1.0
   */
  @Nullable
  public abstract List<Double> distance();

  /**
   * The speed, in meters per second, between each pair of coordinates.
   *
   * @return a list with each entry being a speed value between two of the routeLeg geometry
   *   coordinates
   * @since 2.1.0
   */
  @Nullable
  public abstract List<Double> duration();

  /**
   * The speed, in meters per second, between each pair of coordinates.
   *
   * @return a list with each entry being a speed value between two of the routeLeg geometry
   *   coordinates
   * @since 2.1.0
   */
  @Nullable
  public abstract List<Double> speed();

  /**
   * The congestion between each pair of coordinates.
   *
   * @return a list of Strings with each entry being a congestion value between two of the routeLeg
   *   geometry coordinates
   * @since 2.2.0
   */
  @Nullable
  public abstract List<String> congestion();

  public static TypeAdapter<LegAnnotation> typeAdapter(Gson gson) {
    return new AutoValue_LegAnnotation.GsonTypeAdapter(gson);
  }

  /**
   * This builder can be used to set the values describing the {@link LegAnnotation}.
   *
   * @since 3.0.0
   */
  @AutoValue.Builder
  public abstract static class Builder {

    /**
     * The distance, in meters, between each pair of coordinates.
     *
     * @param distance a list with each entry being a distance value between two of the routeLeg
     *                 geometry coordinates
     * @return this builder for chaining options together
     * @since 3.0.0
     */
    public abstract Builder distance(@Nullable List<Double> distance);

    /**
     * The speed, in meters per second, between each pair of coordinates.
     *
     * @param duration a list with each entry being a speed value between two of the routeLeg
     *                 geometry coordinates
     * @return this builder for chaining options together
     * @since 3.0.0
     */
    public abstract Builder duration(@Nullable List<Double> duration);

    /**
     * The speed, in meters per second, between each pair of coordinates.
     *
     * @param speed a list with each entry being a speed value between two of the routeLeg geometry
     *              coordinates
     * @return this builder for chaining options together
     * @since 3.0.0
     */
    public abstract Builder speed(@Nullable List<Double> speed);

    /**
     * The congestion between each pair of coordinates.
     *
     * @param congestion a list of Strings with each entry being a congestion value between two of
     *                   the routeLeg geometry coordinates
     * @return this builder for chaining options together
     * @since 3.0.0
     */
    public abstract Builder congestion(@Nullable List<String> congestion);

    /**
     * Build a new {@link LegAnnotation} object.
     *
     * @return a new {@link LegAnnotation} using the provided values in this builder
     * @since 3.0.0
     */
    public abstract LegAnnotation build();
  }
}