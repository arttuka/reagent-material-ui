(ns reagent-mui.icons.video-library-sharp
  "Imports @mui/icons-material/VideoLibrarySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-library-sharp (create-svg-icon (e "path" #js {"d" "M4 6H2v16h16v-2H4V6zm18-4H6v16h16V2zM12 14.5v-9l6 4.5-6 4.5z"})
                                          "VideoLibrarySharp"))
