(ns reagent-mui.icons.fullscreen-exit
  "Imports @mui/icons-material/FullscreenExit as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fullscreen-exit (create-svg-icon (e "path" #js {"d" "M5 16h3v3h2v-5H5v2zm3-8H5v2h5V5H8v3zm6 11h2v-3h3v-2h-5v5zm2-11V5h-2v5h5V8h-3z"})
                                      "FullscreenExit"))
