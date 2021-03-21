(ns reagent-material-ui.icons.edit-notifications
  "Imports @material-ui/icons/EditNotifications as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-notifications (create-svg-icon (e "path" #js {"d" "M17.58 6.25l1.77 1.77L14.37 13H12.6v-1.77l4.98-4.98zm3.27-.44l-1.06-1.06c-.2-.2-.51-.2-.71 0l-.85.85L20 7.37l.85-.85c.2-.2.2-.52 0-.71zM18 12.2V17h2v2H4v-2h2v-7c0-2.79 1.91-5.14 4.5-5.8v-.7c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v.7c.82.21 1.57.59 2.21 1.09L10.6 10.4V15h4.6l2.8-2.8zM10 20h4c0 1.1-.9 2-2 2s-2-.9-2-2z"})
                                         "EditNotifications"))
