(ns reagent-mui.icons.install-desktop-sharp
  "Imports @mui/icons-material/InstallDesktopSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-desktop-sharp (create-svg-icon [(e "path" #js {"d" "M20 17H4V5h8V3H2v16h6v2h8v-2h6v-5h-2z"}) (e "path" #js {"d" "m17 14 5-5-1.41-1.41L18 10.17V3h-2v7.17l-2.59-2.58L12 9z"})]
                                            "InstallDesktopSharp"))
