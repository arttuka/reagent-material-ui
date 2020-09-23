(ns reagent-material-ui.icons.local-post-office-two-tone
  "Imports @material-ui/icons/LocalPostOfficeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-post-office-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 11l8-5H4zM4 8v10h16V8l-8 5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V8l8 5 8-5v10zm-8-7L4 6h16l-8 5z"}))
                                                 "LocalPostOfficeTwoTone"))
