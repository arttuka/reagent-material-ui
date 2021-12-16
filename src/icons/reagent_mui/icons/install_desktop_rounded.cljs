(ns reagent-mui.icons.install-desktop-rounded
  "Imports @mui/icons-material/InstallDesktopRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def install-desktop-rounded (create-svg-icon [(e "path" #js {"d" "M20 17H4V5h8V3H4c-1.1 0-2 .9-2 2v12c0 1.1.89 2 2 2h4v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h4c1.1 0 2-.9 2-2v-3h-2v3z"}) (e "path" #js {"d" "M17.71 13.29 21.3 9.7c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L18 10.17V4c0-.55-.45-1-1-1s-1 .45-1 1v6.17l-1.89-1.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l3.59 3.59c.4.39 1.03.39 1.42 0z"})]
                                              "InstallDesktopRounded"))
