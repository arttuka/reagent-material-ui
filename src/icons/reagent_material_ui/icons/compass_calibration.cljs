(ns reagent-material-ui.icons.compass-calibration
  "Imports @material-ui/icons/CompassCalibration as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def compass-calibration (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "4", "cx" "12"}) (e "path" #js {"d" "M12 10.07c1.95 0 3.72.79 5 2.07l5-5C19.44 4.59 15.9 3 12 3S4.56 4.59 2 7.15l5 5c1.28-1.28 3.05-2.08 5-2.08z"}))
                                          "CompassCalibration"))
