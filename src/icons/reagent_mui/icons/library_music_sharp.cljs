(ns reagent-mui.icons.library-music-sharp
  "Imports @mui/icons-material/LibraryMusicSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def library-music-sharp (create-svg-icon (e "path" #js {"d" "M22 2H6v16h16V2zm-4 5h-3v5.5c0 1.38-1.12 2.5-2.5 2.5S10 13.88 10 12.5s1.12-2.5 2.5-2.5c.57 0 1.08.19 1.5.51V5h4v2zM4 6H2v16h16v-2H4V6z"})
                                          "LibraryMusicSharp"))
