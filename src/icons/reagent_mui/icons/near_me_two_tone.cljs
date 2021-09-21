(ns reagent-mui.icons.near-me-two-tone
  "Imports @mui/icons-material/NearMeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def near-me-two-tone (create-svg-icon [(e "path" #js {"d" "m11.39 12.61.32.83 1.32 3.42 4.24-10.13-10.13 4.24 3.42 1.33z", "opacity" ".3"}) (e "path" #js {"d" "m3 11.51 6.84 2.65L12.48 21h.98L21 3 3 10.53v.98zm14.27-4.78-4.24 10.13-1.32-3.42-.32-.83-.82-.32-3.43-1.33 10.13-4.23z"})]
                                       "NearMeTwoTone"))
