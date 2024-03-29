(ns reagent-mui.icons.local-movies-two-tone
  "Imports @mui/icons-material/LocalMoviesTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-movies-two-tone (create-svg-icon [(e "path" #js {"d" "M10 5h4v14h-4z", "opacity" ".3"}) (e "path" #js {"d" "M20 21V3h-2v2h-2V3H8v2H6V3H4v18h2v-2h2v2h8v-2h2v2h2zM8 17H6v-2h2v2zm0-4H6v-2h2v2zm0-4H6V7h2v2zm6 10h-4V5h4v14zm2-12h2v2h-2V7zm0 4h2v2h-2v-2zm0 6v-2h2v2h-2z"})]
                                            "LocalMoviesTwoTone"))
