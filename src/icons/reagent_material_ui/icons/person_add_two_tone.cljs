(ns reagent-material-ui.icons.person-add-two-tone
  "Imports @material-ui/icons/PersonAddTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def person-add-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 16c-2.69 0-5.77 1.28-6 2h12c-.2-.71-3.3-2-6-2z", "opacity" ".3"}) (e "circle" #js {"cy" "8", "r" "2", "cx" "15", "opacity" ".3"}) (e "path" #js {"d" "M15 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm0 8c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4zm-6 4c.22-.72 3.31-2 6-2 2.7 0 5.8 1.29 6 2H9zm-3-3v-3h3v-2H6V7H4v3H1v2h3v3z"}))
                                          "PersonAddTwoTone"))
