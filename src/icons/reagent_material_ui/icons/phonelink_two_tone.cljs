(ns reagent-material-ui.icons.phonelink-two-tone
  "Imports @material-ui/icons/PhonelinkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def phonelink-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 10h4v7h-4z", "opacity" ".3"}) (e "path" #js {"d" "M4 6h18V4H4c-1.1 0-2 .9-2 2v11H0v3h14v-3H4V6zm19 2h-6c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h6c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 9h-4v-7h4v7z"}))
                                         "PhonelinkTwoTone"))
