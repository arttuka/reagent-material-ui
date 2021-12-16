(ns reagent-mui.icons.install-desktop
  "Imports @mui/icons-material/InstallDesktop as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-desktop (create-svg-icon [(e "path" #js {"d" "M20 17H4V5h8V3H4c-1.11 0-2 .89-2 2v12c0 1.1.89 2 2 2h4v2h8v-2h4c1.1 0 2-.9 2-2v-3h-2v3z"}) (e "path" #js {"d" "m17 14 5-5-1.41-1.41L18 10.17V3h-2v7.17l-2.59-2.58L12 9z"})]
                                      "InstallDesktop"))
