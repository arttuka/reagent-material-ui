(ns reagent-mui.icons.upgrade-two-tone
  "Imports @mui/icons-material/UpgradeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upgrade-two-tone (create-svg-icon (e "path" #js {"d" "M16 18v2H8v-2h8zM11 7.99V16h2V7.99h3L12 4 8 7.99h3z"})
                                       "UpgradeTwoTone"))
