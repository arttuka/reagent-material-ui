(ns reagent-mui.icons.stay-primary-landscape-two-tone
  "Imports @mui/icons-material/StayPrimaryLandscapeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-primary-landscape-two-tone (create-svg-icon [(e "path" #js {"d" "M5 7h14v10H5z", "opacity" ".3"}) (e "path" #js {"d" "M21 5H3c-1.1 0-1.99.9-1.99 2L1 17c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm-2 12H5V7h14v10z"})]
                                                      "StayPrimaryLandscapeTwoTone"))
