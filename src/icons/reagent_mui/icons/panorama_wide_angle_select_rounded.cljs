(ns reagent-mui.icons.panorama-wide-angle-select-rounded
  "Imports @mui/icons-material/PanoramaWideAngleSelectRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-wide-angle-select-rounded (create-svg-icon (e "path" #js {"d" "M12 4c-3.97 0-6.85.63-9 1-.55 1.97-1 3.92-1 7 0 3.03.45 5.06 1 7 2.15.37 4.98 1 9 1 3.97 0 6.85-.63 9-1 .57-2.02 1-3.99 1-7 0-3.03-.45-5.06-1-7-2.15-.37-4.98-1-9-1z"})
                                                         "PanoramaWideAngleSelectRounded"))
