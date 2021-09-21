(ns reagent-mui.icons.compass-calibration
  "Imports @mui/icons-material/CompassCalibration as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def compass-calibration (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "17", "r" "4"}) (e "path" #js {"d" "M12 10.07c1.95 0 3.72.79 5 2.07l5-5C19.44 4.59 15.9 3 12 3S4.56 4.59 2 7.15l5 5c1.28-1.28 3.05-2.08 5-2.08z"})]
                                          "CompassCalibration"))
