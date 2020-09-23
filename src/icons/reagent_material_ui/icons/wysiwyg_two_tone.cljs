(ns reagent-material-ui.icons.wysiwyg-two-tone
  "Imports @material-ui/icons/WysiwygTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wysiwyg-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 19H5V7h14v12zm-2-7H7v-2h10v2zm-4 4H7v-2h6v2z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.89-2-2-2zm0 16H5V7h14v12zm-2-7H7v-2h10v2zm-4 4H7v-2h6v2z"}))
                                       "WysiwygTwoTone"))
