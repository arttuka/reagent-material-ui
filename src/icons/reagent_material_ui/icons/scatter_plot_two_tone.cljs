(ns reagent-material-ui.icons.scatter-plot-two-tone
  "Imports @material-ui/icons/ScatterPlotTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def scatter-plot-two-tone (create-svg-icon [(e "circle" #js {"cx" "11", "cy" "6", "r" "2", "opacity" ".3"}) (e "circle" #js {"cx" "16.6", "cy" "17.6", "r" "2", "opacity" ".3"}) (e "circle" #js {"cx" "7", "cy" "14", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M7 10c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm8-10c0-2.21-1.79-4-4-4S7 3.79 7 6s1.79 4 4 4 4-1.79 4-4zm-4 2c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm5.6 5.6c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})]
                                            "ScatterPlotTwoTone"))
