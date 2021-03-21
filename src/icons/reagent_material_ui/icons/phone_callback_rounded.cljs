(ns reagent-material-ui.icons.phone-callback-rounded
  "Imports @material-ui/icons/PhoneCallbackRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def phone-callback-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13.5 11h4.29c.45 0 .67-.54.35-.85L16.7 8.71l4-4c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-4 4-1.44-1.44c-.31-.32-.85-.1-.85.35v4.29c0 .28.22.5.5.5z"}) (e "path" #js {"d" "M15.63 14.4l-2.52 2.5c-2.5-1.43-4.57-3.5-6-6l2.5-2.52c.23-.24.33-.57.27-.9L9.13 3.8c-.09-.46-.5-.8-.98-.8H4c-.56 0-1.03.47-1 1.03.17 2.89 1.05 5.6 2.43 7.97 1.58 2.73 3.85 4.99 6.57 6.57 2.37 1.37 5.08 2.26 7.97 2.43.56.03 1.03-.44 1.03-1v-4.15c0-.48-.34-.89-.8-.98l-3.67-.73c-.33-.07-.67.03-.9.26z"}))
                                             "PhoneCallbackRounded"))
