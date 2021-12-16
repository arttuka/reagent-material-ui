(ns reagent-mui.icons.rotate-90-degrees-cw-two-tone
  "Imports @mui/icons-material/Rotate90DegreesCwTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def rotate-90-degrees-cw-two-tone (create-svg-icon [(e "path" #js {"d" "M4.64 19.37c3.03 3.03 7.67 3.44 11.15 1.25l-1.46-1.46c-2.66 1.43-6.04 1.03-8.28-1.21-2.73-2.73-2.73-7.17 0-9.9C7.42 6.69 9.21 6.03 11 6.03V9l4-4-4-4v3.01c-2.3 0-4.61.87-6.36 2.63-3.52 3.51-3.52 9.21 0 12.73zM11 13l6 6 6-6-6-6-6 6zm6 3.17L13.83 13 17 9.83 20.17 13 17 16.17z"}) (e "path" #js {"d" "m13.8172 12.9945 3.175-3.1749 3.1749 3.175-3.175 3.1748z", "opacity" ".3"})]
                                                    "Rotate90DegreesCwTwoTone"))
