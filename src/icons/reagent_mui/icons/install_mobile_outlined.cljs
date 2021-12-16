(ns reagent-mui.icons.install-mobile-outlined
  "Imports @mui/icons-material/InstallMobileOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-mobile-outlined (create-svg-icon [(e "path" #js {"d" "M17 18H7V6h7V4H7V3h7V1.01L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-5h-2v2zm0 3H7v-1h10v1z"}) (e "path" #js {"d" "m18 14 5-5-1.41-1.41L19 10.17V3h-2v7.17l-2.59-2.58L13 9z"})]
                                              "InstallMobileOutlined"))
