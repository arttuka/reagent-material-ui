(ns reagent-material-ui.icons.forum-sharp
  "Imports @material-ui/icons/ForumSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def forum-sharp (create-svg-icon (e "path" #js {"d" "M22 6h-3v9H6v3h12l4 4V6zm-5 7V2H2v15l4-4h11z"})
                                  "ForumSharp"))
