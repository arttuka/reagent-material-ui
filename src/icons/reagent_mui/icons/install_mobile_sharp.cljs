(ns reagent-mui.icons.install-mobile-sharp
  "Imports @mui/icons-material/InstallMobileSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-mobile-sharp (create-svg-icon [(e "path" #js {"d" "M17 18H7V6h7V1H5v22h14v-7h-2z"}) (e "path" #js {"d" "m18 14 5-5-1.41-1.41L19 10.17V3h-2v7.17l-2.59-2.58L13 9z"})]
                                           "InstallMobileSharp"))
