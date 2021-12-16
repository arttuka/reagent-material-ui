(ns reagent-mui.icons.install-mobile
  "Imports @mui/icons-material/InstallMobile as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-mobile (create-svg-icon [(e "path" #js {"d" "M17 18H7V6h7V1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-5h-2v2z"}) (e "path" #js {"d" "m18 14 5-5-1.41-1.41L19 10.17V3h-2v7.17l-2.59-2.58L13 9z"})]
                                     "InstallMobile"))
