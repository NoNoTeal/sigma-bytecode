public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u7bad\u4c04\uf995\u965f\u9033\u9033 {
    private void \u7bad\u4c04\uf995\u965f\u9033\u9033() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)
            putfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033, invokestatic:ArrayList[expected:List<String[]>](Lists::newArrayList))
            invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::put, putfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033, invokestatic:HashMap[expected:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>](Maps::newHashMap)), invokestatic:Character(Character::valueOf, ldc:char(32)), invokestatic:Predicate[expected:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>](Predicates::alwaysTrue))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u7bad\u4c04\uf995\u965f\u9033\u9033 \u67d0\ub1b9\u516c\u4d85\u5d20\u946b(java.lang.String[] p0) {
        var_2_5F : int
        var_5_10B : int
        var_6_114 : int
        var_7_1AE : String
        var_8_1C1 : char[]
        var_9_1C6 : int
        var_10_1CF : int
        var_11_240 : char
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(-189963601), ldc:int(-1494386485))
        
        if (logicalnot:boolean(invokestatic:boolean(ArrayUtils::isEmpty, checkcast:String[][expected:Object[]](java.lang.String[].class, p0:String[][expected:Object[]])))) {
            if (logicalnot:boolean(invokestatic:boolean(StringUtils::isEmpty, loadelement:String[expected:CharSequence](p0:String[], and:int(ldc:int(-28998), ldc:int(28993)))))) {
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)))) {
                    goto(Label_0198)
                }
                
                putfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u3776\u4c2b\u8bb0\ud158\u5654\u446c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033, arraylength:int(p0:String[]))
                putfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ubefe\u6435\u3776\u3a62\uc229\uc2e8, this:\u7bad\u4c04\uf995\u965f\u9033\u9033, invokevirtual:int(String::length, loadelement:String(p0:String[], and:int(ldc:int(24725), ldc:int(-30176)))))
                goto(Label_0198)
            }
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-221584929))
            goto(Label_0234)
        }
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(4103), ldc:int(2445)))))
        }
        
        var_2_5F = and:int(var_2_5F:int, ldc:int(1799624446))
        Label_0198:
        
        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-118401800))
        }
        else {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0106)
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(-454336297))
            
            if (cmpne:boolean(arraylength:int(p0:String[]), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u3776\u4c2b\u8bb0\ud158\u5654\u446c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(31115), ldc:int(-31116)))), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u3776\u4c2b\u8bb0\ud158\u5654\u446c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(24617), ldc:int(5507)))), arraylength:int(p0:String[])), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(526), ldc:int(5394)))))))
            }
        }
        
        Label_0234:
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-391006678))
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_5_10B = arraylength:int(p0:String[])
            var_6_114 = and:int(ldc:int(30851), ldc:int(-30856))
            
            while (cmplt:boolean(var_6_114:int, var_5_10B:int)) {
                var_7_1AE = loadelement:String(p0:String[], var_6_114:int)
                
                if (cmpne:boolean(invokevirtual:int(String::length, var_7_1AE:String), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ubefe\u6435\u3776\u3a62\uc229\uc2e8, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), xor:int(ldc:int(1026), ldc:int(1025)))), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ubefe\u6435\u3776\u3a62\uc229\uc2e8, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), xor:int(ldc:int(172), ldc:int(168)))), invokevirtual:int(String::length, var_7_1AE:String)), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(16898), ldc:int(4354)))))))
                }
                
                var_8_1C1 = invokevirtual:char[](String::toCharArray, var_7_1AE:String)
                var_9_1C6 = arraylength:int(var_8_1C1:char[])
                var_10_1CF = and:int(ldc:int(8844), ldc:int(-12943))
                
                while (cmplt:boolean(var_10_1CF:int, var_9_1C6:int)) {
                    var_11_240 = loadelement:char(var_8_1C1:char[], var_10_1CF:int)
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), invokestatic:Character(Character::valueOf, var_11_240:char)))) {
                        invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::put, getfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), invokestatic:Character(Character::valueOf, var_11_240:char), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>()))
                    }
                    
                    inc:int(var_10_1CF, ldc:int(1))
                }
                
                inc:int(var_6_114, ldc:int(1))
            }
            
            invokeinterface:boolean(List<String[]>::add, getfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), p0:String[])
            return:\u7bad\u4c04\uf995\u965f\u9033\u9033(this:\u7bad\u4c04\uf995\u965f\u9033\u9033)
        }
        
        goto(Label_0106)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u7bad\u4c04\uf995\u965f\u9033\u9033 \u3776\u92ff\uc2bd\u3dd3\u7af6\u92ee() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u7bad\u4c04\uf995\u965f\u9033\u9033(initobject:\u7bad\u4c04\uf995\u965f\u9033\u9033(\u7bad\u4c04\uf995\u965f\u9033\u9033::<init>))
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u7bad\u4c04\uf995\u965f\u9033\u9033 \ud12e\u4f4a\u873d\ucfaf\ud51e\u6c56(char p0, java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23> p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::put, getfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), invokestatic:Character(Character::valueOf, p0:char), p1:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>)
            return:\u7bad\u4c04\uf995\u965f\u9033\u9033(this:\u7bad\u4c04\uf995\u965f\u9033\u9033)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u760c\u516c\u16f6\uc229\u5fe1\ud158 \u7043\u8cae\u446c\u183a\u9937\ucef1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u760c\u516c\u16f6\uc229\u5fe1\ud158(initobject:\u760c\u516c\u16f6\uc229\u5fe1\ud158(\u760c\u516c\u16f6\uc229\u5fe1\ud158::<init>, invokespecial:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>[][][](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u6435\u3dd3\u74b1\u392e\u7c6b\u8389, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>[][][] \u6435\u3dd3\u74b1\u392e\u7c6b\u8389() {
        var_1_5F : int
        stack_9B_0 : Class<Predicate> [generated]
        expr_6D : int[] [generated]
        var_3_A4 : Predicate[][][]
        var_4_AC : int
        var_1_133 : int
        var_5_F1 : int
        var_6_12D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(1246953377), ldc:int(-346457877))
            invokespecial:void(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u8d98\u6198\u64ab\ud171\u74b1\u6b5f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)
            stack_9B_0 = ldc:Class<Predicate>(java.util.function.Predicate.class)
            expr_6D = newarray:int[](int.class, xor:int(ldc:int(2642), ldc:int(2641)))
            storeelement:int(expr_6D:int[], and:int(ldc:int(2674), ldc:int(-2675)), invokeinterface:int(List<E>::size, getfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)))
            storeelement:int(expr_6D:int[], xor:int(ldc:int(210), ldc:int(211)), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u3776\u4c2b\u8bb0\ud158\u5654\u446c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))
            storeelement:int(expr_6D:int[], and:int(ldc:int(4818), ldc:int(3)), getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ubefe\u6435\u3776\u3a62\uc229\uc2e8, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))
            var_3_A4 = checkcast:Predicate[][][](java.util.function.Predicate[][][].class, checkcast:Predicate[][][](java.util.function.Predicate[][][].class, invokestatic:Object[expected:Predicate[][][]](Array::newInstance, stack_9B_0:Class<Predicate>, expr_6D:int[])))
            var_4_AC = and:int(ldc:int(-5451), ldc:int(5450))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_133 = and:int(var_1_5F:int, ldc:int(262981214))
                }
                else {
                    var_1_133 = and:int(var_1_5F:int, ldc:int(-646480961))
                    
                    if (cmplt:boolean(var_4_AC:int, invokeinterface:int(List<E>::size, getfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)))) {
                        var_5_F1 = and:int(ldc:int(12552), ldc:int(-12553))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_133:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_133 = and:int(var_1_133:int, ldc:int(1351754955))
                            }
                            else {
                                var_1_133 = and:int(var_1_133:int, ldc:int(-906235029))
                                
                                if (cmplt:boolean(var_5_F1:int, getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u3776\u4c2b\u8bb0\ud158\u5654\u446c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))) {
                                    var_6_12D = and:int(ldc:int(23944), ldc:int(-24061))
                                    
                                    loop {
                                        var_1_133 = and:int(var_1_133:int, ldc:int(-595822987))
                                        
                                        if (cmpge:boolean(var_6_12D:int, getfield:int(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ubefe\u6435\u3776\u3a62\uc229\uc2e8, this:\u7bad\u4c04\uf995\u965f\u9033\u9033))) {
                                            looporswitchbreak()
                                        }
                                        
                                        storeelement:Predicate(loadelement:Predicate[](loadelement:Predicate[][](var_3_A4:Predicate[][][], var_4_AC:int), var_5_F1:int), var_6_12D:int, checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::get, getfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), invokestatic:Character(Character::valueOf, invokevirtual:char(String::charAt, loadelement:String(checkcast:String[](java.lang.String[].class, invokeinterface:String[](List<String[]>::get, getfield:List<String[]>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\u97e6\u97e6\uc229\u8413\ub8be\u718f, this:\u7bad\u4c04\uf995\u965f\u9033\u9033), var_4_AC:int)), var_5_F1:int), var_6_12D:int)))))
                                        inc:int(var_6_12D, ldc:int(1))
                                    }
                                    
                                    var_1_133 = and:int(var_1_133:int, ldc:int(-321194381))
                                    inc:int(var_5_F1, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_133:int, ldc:int(4096)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_5F = and:int(var_1_133:int, ldc:int(-1453491543))
                        inc:int(var_4_AC, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_133:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_133:int, ldc:int(-1613725257))
            }
            
            return:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>[][][](var_3_A4:Predicate[][][])
        }
        
        goto(Label_0006)
    }
    
    private void \u8d98\u6198\u64ab\ud171\u74b1\u6b5f() {
        var_1_7F : int
        var_3_63 : ArrayList
        var_4_72 : Iterator<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>
        var_5_F4 : Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_7F = and:int(ldc:int(1485890887), ldc:int(701460428))
        var_3_63 = invokestatic:ArrayList(Lists::newArrayList)
        var_4_72 = invokeinterface:Iterator<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>(Set<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>::iterator, invokeinterface:Set<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>(Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::entrySet, getfield:Map<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(\u7bad\u4c04\uf995\u965f\u9033\u9033::\ube23\uf9c5\u4bc8\u6b0d\uc229\u516c, this:\u7bad\u4c04\uf995\u965f\u9033\u9033)))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_7F:int, ldc:int(8192)), ldc:int(0))) {
                var_1_7F = and:int(var_1_7F:int, ldc:int(-161899678))
                goto(Label_0190)
            }
            
            if (cmpne:boolean(and:int(var_1_7F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_7F = and:int(var_1_7F:int, ldc:int(-1617811853))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_72:Iterator<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>)) {
                    var_5_F4 = checkcast:Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(java.util.Map.Entry<java.lang.Character, java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>>.class, invokeinterface:Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>(Iterator<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>::next, var_4_72:Iterator<Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>>))
                    
                    if (cmpeq:boolean(invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::getValue, var_5_F4:Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>), aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())) {
                        invokeinterface:boolean(List<Character>::add, var_3_63:ArrayList<Character>[expected:List<Character>], invokeinterface:Character(Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>::getKey, var_5_F4:Entry<Character, Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>>))
                    }
                    
                    var_1_7F = and:int(var_1_7F:int, ldc:int(731016693))
                    loopcontinue()
                }
            }
            
            Label_0153:
            
            if (cmpeq:boolean(and:int(var_1_7F:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_7F:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_7F = and:int(var_1_7F:int, ldc:int(8841246))
                    loopcontinue()
                }
                
                var_1_7F = and:int(var_1_7F:int, ldc:int(1038677157))
                
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, var_3_63:ArrayList<Character>))) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), and:int(ldc:int(17830), ldc:int(10262)))), invokevirtual:String(Joiner::join, getstatic:Joiner(\u7bad\u4c04\uf995\u965f\u9033\u9033::\uc2bd\u1187\uc87f\u6fb0\ucef1\u1187), var_3_63:ArrayList<Character>[expected:Iterable])), loadelement:String(getstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3), xor:int(ldc:int(8324), ldc:int(8323)))))))
                }
            }
            
            Label_0190:
            
            if (cmpne:boolean(and:int(var_1_7F:int, ldc:int(16)), ldc:int(0))) {
                var_1_7F = and:int(var_1_7F:int, ldc:int(-1181625263))
                goto(Label_0153)
            }
            
            if (cmpeq:boolean(and:int(var_1_7F:int, ldc:int(65536)), ldc:int(0))) {
                return:void()
            }
            
            var_1_7F = and:int(var_1_7F:int, ldc:int(2063455553))
        }
    }
    
    static {
        var_0_80 : int
        expr_68 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_2AD_0 : byte[] [generated]
        stack_303_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_21C : int
        var_3_221 : byte[]
        var_5_222 : int
        var_0_24D : int
        expr_233 : byte [generated]
        stack_27B_2 : byte [generated]
        stack_250_0 : byte [generated]
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_29B : byte[]
        var_5_29C : int
        expr_BF : int [generated]
        var_3_2F1 : byte[]
        var_5_2F2 : int
        expr_309 : byte [generated]
        var_3_F9 : String
        expr_101 : String[] [generated]
        expr_10B : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_80 = and:int(ldc:int(-468641716), ldc:int(-674933283))
            expr_68 = stack_93_0 = stack_95_0 = stack_BD_0 = stack_BF_0 = stack_ED_0 = stack_2AD_0 = stack_303_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bM+8RTHR/XwDgsLAb0D//5A8QfZKg322UIC5RcBwUD9BMkyBPwLw0DINwwCAvf30Uj5x/wKOv33DgfBQP0EyTIE/Au/KBzsDvjQMwzwAxL0Eco6/PXTS/X7CwPtC/8SAvMRB8NL9fsLBMkyBPwLyDcMAgL399FI+cIjHvfTRQP/vjcb5AbbOwG8PAcEyUIC5RcBw0v1+wsEwz7xFLw8BwS9R/zwARIC99kyBQP8C8v3TOv/EgLzEQfADiERDvYF/PMR9to6/PXNTvr+9Q4C8xL9xT3JCkw=="))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_21C = expr_6E:int
                var_3_221 = newarray:byte[](byte.class, expr_6E:int)
                var_5_222 = expr_6E:int
                
                loop {
                    var_0_24D = and:int(var_0_80:int, ldc:int(-294947867))
                    var_5_222 = add:int(var_5_222:int, ldc:int(-1))
                    expr_233 = stack_27B_2 = loadelement(expr_68, var_5_222)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_222:int, ldc:int(1)), neg:int(var_4_21C:int)), ldc:int(0))) {
                        stack_27B_2 = stack_250_0 = add:byte(expr_233:byte, loadelement:byte(var_3_221:byte[], add:int(var_5_222:int, ldc:int(1))))
                        goto(Label_0608)
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(1024)), ldc:int(0))) {
                        var_0_24D = and:int(var_0_24D:int, ldc:int(-842975372))
                        stack_27B_2 = stack_250_0 = add:byte(expr_233:byte, ldc:byte(1))
                    }
                    
                    Label_0608:
                    
                    if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_24D = and:int(var_0_24D:int, ldc:int(-2093105118))
                        goto(Label_0576)
                    }
                    
                    var_0_80 = and:int(var_0_24D:int, ldc:int(-686713178))
                    storeelement:byte(var_3_221:byte[], var_5_222:int, stack_27B_2:byte)
                    
                    if (cmpne:boolean(var_5_222:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_BD_0 = stack_BF_0 = stack_ED_0 = stack_2AD_0 = stack_303_0 = var_3_221:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(4)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(244648638))
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-324987627))
                    var_2_93 = stack_93_0:byte[]
                    expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                        var_3_29B = newarray:byte[](byte.class, expr_97:int)
                        var_5_29C = expr_97:int
                        
                        loop {
                            var_0_80 = and:int(var_0_80:int, ldc:int(-169255420))
                            var_5_29C = add:int(var_5_29C:int, ldc:int(-1))
                            storeelement:byte(var_3_29B:byte[], var_5_29C:int, add:int(shl:int(loadelement:byte(stack_2AD_0:byte[], var_5_29C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_29C:int, and:int(ldc:int(4155), ldc:int(16453)))), ldc:int(2)), xor:int(ldc:int(5141), ldc:int(5162)))))
                            
                            if (cmpne:boolean(var_5_29C:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_BD_0 = stack_BF_0 = stack_ED_0 = stack_2AD_0 = stack_303_0 = var_3_29B:byte[]
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_80:int, ldc:int(256)), ldc:int(0))) {
                        var_0_80 = and:int(var_0_80:int, ldc:int(-13785962))
                        loopcontinue()
                    }
                    
                    var_0_80 = and:int(var_0_80:int, ldc:int(-61795089))
                    expr_BF = arraylength:int(stack_BF_0:byte[])
                    
                    if (cmpne:boolean(expr_BF:int, ldc:int(0))) {
                        var_3_2F1 = newarray:byte[](byte.class, expr_BF:int)
                        var_5_2F2 = expr_BF:int
                        
                        loop {
                            var_0_80 = and:int(var_0_80:int, ldc:int(-827621442))
                            var_5_2F2 = add:int(var_5_2F2:int, ldc:int(-1))
                            expr_309 = xor:byte(add:byte(loadelement:byte(stack_303_0:byte[], var_5_2F2:int), ldc:byte(95)), ldc:byte(6))
                            storeelement:byte(var_3_2F1:byte[], var_5_2F2:int, or:int(and:int(shl:int(expr_309:byte, xor:int(ldc:int(16771), ldc:int(16775))), ldc:int(-16)), and:int(shr:int(expr_309:byte[expected:int], xor:int(ldc:int(647), ldc:int(643))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_2F2:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_BD_0 = stack_BF_0 = stack_ED_0 = stack_2AD_0 = stack_303_0 = var_3_2F1:byte[]
                    }
                }
                
                Label_0196:
                
                if (cmpne:boolean(and:int(var_0_80:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(1349843163))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_80 = and:int(var_0_80:int, ldc:int(1767397903))
            }
            
            var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_101 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(621), ldc:int(16411)))
            expr_10B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2214), ldc:int(2223)))
            storeelement:String(expr_10B:String[], and:int(ldc:int(7), ldc:int(29199)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(27779), ldc:int(-27796)), xor:int(ldc:int(515), ldc:int(527))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(4622), ldc:int(16434)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(16654), ldc:int(716)), and:int(ldc:int(8493), ldc:int(3149))))
            storeelement:String(expr_101:String[], and:int(ldc:int(1674), ldc:int(18476)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16450), ldc:int(16463)), xor:int(ldc:int(102), ldc:int(104))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(8194), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16446), ldc:int(16432)), and:int(ldc:int(119), ldc:int(14523))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(24832), ldc:int(24836)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(633), ldc:int(586)), xor:int(ldc:int(283), ldc:int(351))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(12293), ldc:int(17685)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(20550), ldc:int(3020)), xor:int(ldc:int(25096), ldc:int(25171))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(10480), ldc:int(-14833)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(4880), ldc:int(4939)), xor:int(ldc:int(-15302), ldc:int(-15293))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(2946), ldc:int(2945)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8319), ldc:int(121)), and:int(ldc:int(189), ldc:int(11449))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(102), ldc:int(11014)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16752), ldc:int(16841)), xor:int(ldc:int(8425), ldc:int(8252))))
            putstatic:String[](\u7bad\u4c04\uf995\u965f\u9033\u9033::\u4c2b\u4ab3\ub1b9\u64ab\u0800\uc3e3, expr_10B:String[])
            putstatic:Joiner(\u7bad\u4c04\uf995\u965f\u9033\u9033::\uc2bd\u1187\uc87f\u6fb0\ucef1\u1187, invokestatic:Joiner(Joiner::on, loadelement:String(expr_101:String[], xor:int(ldc:int(-15359), ldc:int(-15351)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u120d\uc29a\u6c56\ubf56\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_644 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_64F : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_644 = and:int(ldc:int(-1462735099), ldc:int(-960858547))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\u4c04\uf995\u965f\u9033\u9033[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
            var_3_644 = and:int(var_3_644:int, ldc:int(-1279986006))
            var_5_81 = and:int(ldc:int(8853), ldc:int(-8854))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6183), ldc:int(-22648)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_644:int, ldc:int(-1141805291))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(16657), ldc:int(13385)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(2625), ldc:int(17417)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_644 = and:int(var_3_D1:int, ldc:int(-440993862))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(1035), ldc:int(1034)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1341524471))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-202380254))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0667)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1045764872))
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-172890155))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1120387224))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1484752375))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(575704508))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0667)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-2078041965))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-744659248))
                            var_11_E2 = and:int(ldc:int(-31069), ldc:int(26956))
                            goto(Label_1466)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0553:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(535737804))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-860798328))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1392320816))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-554567760))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0667:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1672290043))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1298403624))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1392272400))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1193821272))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1445595207))
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1340477524))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-560038040))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(24593), ldc:int(2217))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0894:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-685642994))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-140385890))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1940316964))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1818713435))
                            goto(Label_0667)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-665594984))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-134387802))
                        var_11_E2 = and:int(ldc:int(-8167), ldc:int(7970))
                    }
                    
                    Label_1058:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-965923985))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(783860818))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1665292826))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-841554283))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1313)
                            }
                        }
                    }
                    
                    Label_1169:
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1893419262))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1927503858))
                            goto(Label_1058)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1192781510))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(1519006995))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_644 = and:int(var_3_644:int, ldc:int(-1398643589))
                            loopcontinue()
                        }
                        
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1529715177))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1466)
                    }
                    
                    Label_1313:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1349214351))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1323342354))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1558016284))
                        goto(Label_0667)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1167396936))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-1757715002))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-708738028))
                        loopcontinue()
                    }
                    
                    var_3_644 = and:int(var_3_644:int, ldc:int(-1328054631))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1466:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1477:
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(813288417))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(818857039))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1935591604))
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1011322635))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(426251639))
                        goto(Label_0667)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(1613146134))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_644:int, ldc:int(512)), ldc:int(0))) {
                        var_3_644 = and:int(var_3_644:int, ldc:int(-839286830))
                        var_17_64F = add:int(var_16_110:int, and:int(ldc:int(16401), ldc:int(2699)))
                        looporswitchbreak()
                    }
                }
                
                var_3_644 = and:int(var_3_644:int, ldc:int(-1496254587))
                
                if (cmple:boolean(var_5_81 = var_17_64F:int, sub:int(var_6_88:int, and:int(ldc:int(11147), ldc:int(16389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_644:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
