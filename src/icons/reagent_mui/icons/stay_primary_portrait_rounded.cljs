(ns reagent-mui.icons.stay-primary-portrait-rounded
  "Imports @mui/icons-material/StayPrimaryPortraitRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-primary-portrait-rounded (create-svg-icon (e "path" #js {"d" "M17 1.01 7 1c-1.1 0-1.99.9-1.99 2v18c0 1.1.89 2 1.99 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z"})
                                                    "StayPrimaryPortraitRounded"))
