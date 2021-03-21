(ns reagent-material-ui.icons.add-photo-alternate-rounded
  "Imports @material-ui/icons/AddPhotoAlternateRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-photo-alternate-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 9h-1c-.55 0-1-.45-1-1V3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-8h-5c-.55 0-1-.45-1-1V9zm2 8H7c-.41 0-.65-.47-.4-.8l2-2.67c.2-.27.6-.27.8 0L11.25 16l2.6-3.47c.2-.27.6-.27.8 0l2.75 3.67c.25.33.01.8-.4.8z"}) (e "path" #js {"d" "M19 5V4c0-.55-.45-1-1-1s-1 .45-1 1v1h-1c-.55 0-1 .45-1 1s.45 1 1 1h1v1c0 .55.45 1 1 1s1-.45 1-1V7h1c.55 0 1-.45 1-1s-.45-1-1-1h-1z"}))
                                                  "AddPhotoAlternateRounded"))
