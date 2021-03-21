(ns reagent-material-ui.icons.add-business-rounded
  "Imports @material-ui/icons/AddBusinessRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def add-business-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 4h13c.55 0 1 .45 1 1s-.45 1-1 1H3c-.55 0-1-.45-1-1s.45-1 1-1zm13 13c.55 0 1-.45 1-1v-2c.55 0 1-.45 1-1v-.9c0-.07-.01-.13-.02-.2l-.82-4.1c-.09-.46-.5-.8-.98-.8H2.82c-.48 0-.89.34-.98.8l-.82 4.1c-.01.07-.02.13-.02.2v.9c0 .55.45 1 1 1v5c0 .55.45 1 1 1h7c.55 0 1-.45 1-1v-5h4v2c0 .55.45 1 1 1zm-7 1H4v-4h5v4z"}) (e "path" #js {"d" "M22 18h-2v-2c0-.55-.45-1-1-1s-1 .45-1 1v2h-2c-.55 0-1 .45-1 1s.45 1 1 1h2v2c0 .55.45 1 1 1s1-.45 1-1v-2h2c.55 0 1-.45 1-1s-.45-1-1-1z"}))
                                           "AddBusinessRounded"))
