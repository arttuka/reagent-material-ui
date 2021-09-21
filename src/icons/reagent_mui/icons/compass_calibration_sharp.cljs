(ns reagent-mui.icons.compass-calibration-sharp
  "Imports @mui/icons-material/CompassCalibrationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def compass-calibration-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "17", "r" "4"}) (e "path" #js {"d" "M12 3C8.1 3 4.56 4.59 2 7.15l5 5c1.28-1.28 3.05-2.08 5-2.08s3.72.79 5 2.07l5-5C19.44 4.59 15.9 3 12 3z"})]
                                                "CompassCalibrationSharp"))
