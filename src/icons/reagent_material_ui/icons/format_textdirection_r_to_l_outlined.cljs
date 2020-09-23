(ns reagent-material-ui.icons.format-textdirection-r-to-l-outlined
  "Imports @material-ui/icons/FormatTextdirectionRToLOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-textdirection-r-to-l-outlined (create-svg-icon (e "path" #js {"d" "M10 4v4c-1.1 0-2-.9-2-2s.9-2 2-2m8-2h-8C7.79 2 6 3.79 6 6s1.79 4 4 4v5h2V4h2v11h2V4h2V2zM8 14l-4 4 4 4v-3h12v-2H8v-3z"})
                                                           "FormatTextdirectionRToLOutlined"))
