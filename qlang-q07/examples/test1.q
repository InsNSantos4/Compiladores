q: question;
g: question;
f: fraction;

hole Question.q1 is
    print "A atribuição de valor em PIL usa o operador " ans->":=" ".";
    println "Para separar statements é usado o operador " ans->";" ".";
end; # automatic grading

hole Question.q2 is
    println "A sigla PIL significa " ans->"Procedural Imperative Language" ".";
end; # automatic grading

q := new Question;      # select a random question from group Question (either q1 or q2)
f := execute q;         # execute question stored in variable q


g := new Question;      # select a random question from group Question (the question previously selected should not be an option in order to avoid repetetition)
f := execute g;         # execute question stored in variable q

export result to "result.txt"; # export (to a file) current questionnaire results
# export command can be executed anywhere!