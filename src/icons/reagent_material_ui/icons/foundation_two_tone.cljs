(ns reagent-material-ui.icons.foundation-two-tone
  "Imports @material-ui/icons/FoundationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def foundation-two-tone (create-svg-icon [(e "path" #js {"d" "M7 15v-4.81l4-3.6V15H7zm6 0V6.59l4 3.6V15h-4z", "opacity" ".3"}) (e "path" #js {"d" "M19 12h3L12 3 2 12h3v3H3v2h2v3h2v-3h4v3h2v-3h4v3h2v-3h2v-2h-2v-3zM7 15v-4.81l4-3.6V15H7zm6 0V6.59l4 3.6V15h-4z"})]
                                          "FoundationTwoTone"))
