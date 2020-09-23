(ns reagent-material-ui.icons.topic-two-tone
  "Imports @material-ui/icons/TopicTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def topic-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 18H4V6h5.17l2 2H20v10zm-2-6H6v-2h12v2zm-4 4H6v-2h8v2z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16.77c.68 0 1.23-.56 1.23-1.23V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10zm-2-6H6v-2h12v2zm-4 4H6v-2h8v2z"}))
                                     "TopicTwoTone"))
