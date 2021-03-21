(ns reagent-material-ui.icons.topic-sharp
  "Imports @material-ui/icons/TopicSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def topic-sharp (create-svg-icon (e "path" #js {"d" "M12 6l-2-2H2v16h20V6H12zm2 10H6v-2h8v2zm4-4H6v-2h12v2z"})
                                  "TopicSharp"))
