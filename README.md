# AIWolfCompo

Your one-stop shop for the AIWerewolf Competition

This repository provides the necessary resources for participation in the
annual AI werewolf contest organized by [AIWolf.org](http://aiwolf.org/en).
This includes rulesets, sample clients, and tutorials for each supported
programming languages.

## Current AI Werewolf Competition:

- **Venue**: [Tenth International Automated Negotiating Agents Competition (ANAC)](http://web.tuat.ac.jp/~katfuji/ANAC2019/)
- **Date and Location**: IJCAI 2019, Macao, August 10th to 16th
- **Server Version**: AIWolf Server 0.5.* (latest bugfix 0.5.4)
- **Agent Submission Deadline**:

## What is available at this repository?

This repository contains a summary of English information necessary to join
the AIWolf competition. In particular, this repository contains:

- Game Rules and Protocol Specification in the [documentation directory](/docs).
- Information about the [gameserver](/server)
- Code samples and HOWTO write an agent in [JAVA](/client-java)
- Code samples and HOWTO write an agent in [Python](/client-python)
- Code samples and HOWTO write an agent in [C#](/client-c)

## Where can I find more information?

The main source of information is the [AIWolf project website](http://aiwolf.org/en).

You can send e-mails with technical and rules questions to the [gm@aiwolf.org](mailto:gm@aiwolf.org) mailing list.

If you have any questions, please join our Slack channel! Fill [this Google Form](https://goo.gl/forms/VIXeJXvwg9YN4rHF3) to request an invite.

## What is AI Werewolf?

Werewolf (also sometimes called Mafia) is a party/social game. The goal
of the game is to simulate a town invaded by werewolves, and is based
on the dynamics of uninformed majority vs informed minority.

The basic rules are as follow: Each player is a Human or a Werewolf. The
werewolf players know who the other werewolves are, but the human players do not
know who is a human and who is a werewolf. Each turn (day), the players discuss
and vote on one player to be removed from the game. Usually, the werewolves will
pretend to be human and try to accuse other humans of being werewolves, in order
to get they voted out of the game. After each voting round the werewolves
can choose to eat one player at night, removing them from the game.

The game can be further complicated by the addition of roles, such as
seers who can divine who is a werewolf and who is a human, and bodyguards,
who can prevent a player from being eaten by a werewolf.

**AIWolf** is a project that aims to build AI agents that can play the
werewolf game. The challenges of the werewolf game include: Modeling the
behaviors of players, estimating the likelihood of werewolf and humans,
discussion and negotiation with other players on voting strategy, and
Natural Language understanding and speaking.
