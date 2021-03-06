(ns reagent-material-ui.icons.offline-share-rounded
  "Imports @material-ui/icons/OfflineShareRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def offline-share-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5c-.55 0-1 .45-1 1v15c0 1.1.9 2 2 2h9c.55 0 1-.45 1-1s-.45-1-1-1H6V6c0-.55-.45-1-1-1z"}) (e "path" #js {"d" "M18 1h-8c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 14h-8V5h8v10z"}) (e "path" #js {"d" "M12.5 10.25h2v.54c0 .45.54.67.85.35l1.29-1.29c.2-.2.2-.51 0-.71l-1.29-1.29c-.31-.31-.85-.09-.85.35v.54H12c-.55 0-1 .45-1 1v1.5c0 .41.34.75.75.75s.75-.34.75-.75v-.99z"}))
                                            "OfflineShareRounded"))
