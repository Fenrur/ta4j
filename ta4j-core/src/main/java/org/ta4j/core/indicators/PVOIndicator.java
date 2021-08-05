/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2017 Marc de Verdelhan, 2017-2021 Ta4j Organization & respective
 * authors (see AUTHORS)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ta4j.core.indicators;

import org.ta4j.core.BarSeries;
import org.ta4j.core.indicators.helpers.VolumeIndicator;

import static org.ta4j.core.utils.Analysis.volume;

/**
 * Percentage Volume Oscillator (PVO): ((12-day EMA of Volume - 26-day EMA of
 * Volume)/26-day EMA of Volume) x 100
 *
 * @see <a href=
 *      "https://school.stockcharts.com/doku.php?id=technical_indicators:percentage_volume_oscillator_pvo">
 *      https://school.stockcharts.com/doku.php?id=technical_indicators:percentage_volume_oscillator_pvo
 *      </a>
 */
public class PVOIndicator extends PPOIndicator {

    /**
     * @param series the bar series {@link BarSeries}. Will use PPO default
     *               constructor with shortBarCount "12" and longBarCount "26".
     */
    public PVOIndicator(BarSeries series) {
        super(volume(series));
    }

    /**
     * @param series         the bar series {@link BarSeries}.
     * @param volumeBarCount Volume Indicator bar count. Will use PPO default
     *                       constructor with shortBarCount "12" and longBarCount
     *                       "26".
     */
    public PVOIndicator(BarSeries series, int volumeBarCount) {
        super(volume(series, volumeBarCount));
    }

    /**
     * @param series        the bar series {@link BarSeries}.
     * @param shortBarCount PPO short time frame.
     * @param longBarCount  PPO long time frame.
     */
    public PVOIndicator(BarSeries series, int shortBarCount, int longBarCount) {
        super(volume(series), shortBarCount, longBarCount);
    }

    /**
     * @param series         the bar series {@link BarSeries}.
     * @param volumeBarCount Volume Indicator bar count.
     * @param shortBarCount  PPO short time frame.
     * @param longBarCount   PPO long time frame.
     */
    public PVOIndicator(BarSeries series, int volumeBarCount, int shortBarCount, int longBarCount) {
        super(volume(series, volumeBarCount), shortBarCount, longBarCount);
    }

}
