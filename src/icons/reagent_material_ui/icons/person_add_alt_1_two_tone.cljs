(ns reagent-material-ui.icons.person-add-alt-1-two-tone
  "Imports @material-ui/icons/PersonAddAlt1TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def person-add-alt-1-two-tone (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "8", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M9 16c-2.7 0-5.8 1.29-6 2h12c-.22-.72-3.31-2-6-2z", "opacity" ".3"}) (e "path" #js {"d" "M9 14c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4zm-6 4c.2-.71 3.3-2 6-2 2.69 0 5.78 1.28 6 2H3zm17-8V7h-2v3h-3v2h3v3h2v-3h3v-2zM9 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2z"})]
                                                "PersonAddAlt1TwoTone"))
