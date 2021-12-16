(ns reagent-mui.icons.install-mobile-rounded
  "Imports @mui/icons-material/InstallMobileRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-mobile-rounded (create-svg-icon [(e "path" #js {"d" "M18.71 13.29 22.3 9.7c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L19 10.17V4c0-.55-.45-1-1-1s-1 .45-1 1v6.17l-1.89-1.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l3.59 3.59c.4.39 1.03.39 1.42 0z"}) (e "path" #js {"d" "M17 18H7V6h7V1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-5h-2v2z"})]
                                             "InstallMobileRounded"))
