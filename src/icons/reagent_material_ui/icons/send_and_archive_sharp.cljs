(ns reagent-material-ui.icons.send-and-archive-sharp
  "Imports @material-ui/icons/SendAndArchiveSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def send-and-archive-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 10c.1 0 .19.01.28.01L3 4v6l8 2-8 2v6l7-2.95V17c0-3.87 3.13-7 7-7z"}) (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm0 8l-3-3h2.5v-3h1v3H20l-3 3z"}))
                                             "SendAndArchiveSharp"))
