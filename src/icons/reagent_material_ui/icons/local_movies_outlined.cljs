(ns reagent-material-ui.icons.local-movies-outlined
  "Imports @material-ui/icons/LocalMoviesOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-movies-outlined (create-svg-icon (e "path" #js {"d" "M14 5v14h-4V5h4m6-2h-2v2h-2V3H8v2H6V3H4v18h2v-2h2v2h8v-2h2v2h2V3zm-4 6V7h2v2h-2zM6 9V7h2v2H6zm10 4v-2h2v2h-2zM6 13v-2h2v2H6zm10 4v-2h2v2h-2zM6 17v-2h2v2H6z"})
                                            "LocalMoviesOutlined"))
