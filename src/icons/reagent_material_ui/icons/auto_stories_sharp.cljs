(ns reagent-material-ui.icons.auto-stories-sharp
  "Imports @material-ui/icons/AutoStoriesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-stories-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M21 4.6v12.02c-1.14-.41-2.31-.62-3.5-.62-1.9 0-3.78.54-5.5 1.58V5.48C10.38 4.55 8.51 4 6.5 4S2.62 4.55 1 5.48V20c1.52-1.18 3.43-2 5.5-2s3.98.82 5.5 2c1.52-1.18 3.43-2 5.5-2s3.98.82 5.5 2V5.48c-.63-.36-1.3-.64-2-.88z"}) (e "path" #js {"d" "M19 .5l-5 5V15l5-4.5z"}))
                                         "AutoStoriesSharp"))
