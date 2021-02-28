public class \u51fa\u12cb\u7330\u74b1\u6c52.\u8258\ub19c\u0b8e\u98a4\u0800\ud217 {
    private void \u8258\ub19c\u0b8e\u98a4\u0800\ud217(java.lang.String p0, int p1) {
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
            invokespecial:Object(Object::<init>, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217)
            putfield:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u4daf\ud217\u8bb0\u93a2\u7ce1\u64ab, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217, p0:String)
            putfield:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7043\uf995\u494c\ud158\u0b8e\u3711, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uc910\u67e9\uc29a\ua3b4\u2dcc\u965f() {
        var_1_5F : int
        stack_71_0 : String [generated]
        
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
        var_1_5F = and:int(ldc:int(-1436959321), ldc:int(-1359501173))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1109395057))
            stack_71_0 = invokestatic:String(IDN::toASCII, getfield:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u4daf\ud217\u8bb0\u93a2\u7ce1\u64ab, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217))
            var_1_5F = and:int(var_1_5F:int, ldc:int(-531661173))
            return:String(stack_71_0:String)
        }
        catch (java.lang.IllegalArgumentException var_3_76) {
            return:String(loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(-12250), ldc:int(3537))))
        }
    }
    
    public int \ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2() {
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
            return:int(getfield:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7043\uf995\u494c\ud158\u0b8e\u3711, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u8258\ub19c\u0b8e\u98a4\u0800\ud217 \u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a(java.lang.String p0) {
        var_1_5F : int
        var_1_68 : int
        var_3_78 : String[]
        var_4_EC : int
        var_5_107 : String
        var_6_11A : String
        var_6_16C : String
        expr_175 : String[] [generated]
        expr_13B : String[] [generated]
        expr_19D : String[] [generated]
        var_4_B8 : String
        var_5_1C5 : int
        var_6_1E8 : Pair<String, Integer>
        
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
        var_1_5F = and:int(ldc:int(-591926904), ldc:int(-565762627))
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_1_68 = and:int(var_1_5F:int, ldc:int(-68700418))
            var_3_78 = invokevirtual:String[](String::split, p0:String, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(1089), ldc:int(2327))))
            
            if (invokevirtual:boolean(String::startsWith, p0:String, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(17438), ldc:int(10499))))) {
                var_4_EC = invokevirtual:int(String::indexOf, p0:String, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(475), ldc:int(17411))))
                
                if (cmpgt:boolean(var_4_EC:int, ldc:int(0))) {
                    var_5_107 = invokevirtual:String(String::substring, p0:String, and:int(ldc:int(65), ldc:int(19367)), var_4_EC:int)
                    var_6_11A = invokevirtual:String(String::trim, invokevirtual:String(String::substring, p0:String, add:int(var_4_EC:int, and:int(ldc:int(7), ldc:int(817)))))
                    
                    if (logicaland:boolean(invokevirtual:boolean(String::startsWith, var_6_11A:String, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(4112), ldc:int(4113)))), logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_6_11A:String)))) {
                        var_6_16C = invokevirtual:String(String::substring, var_6_11A:String, and:int(ldc:int(12401), ldc:int(261)))
                        expr_175 = newarray:String[](java.lang.String.class, xor:int(ldc:int(2304), ldc:int(2306)))
                        storeelement:String(expr_175:String[], and:int(ldc:int(-27054), ldc:int(18853)), var_5_107:String)
                        storeelement:String(expr_175:String[], xor:int(ldc:int(616), ldc:int(617)), var_6_16C:String)
                        var_3_78 = expr_175:String[]
                    }
                    else {
                        var_1_68 = and:int(var_1_68:int, ldc:int(-781767729))
                        expr_13B = newarray:String[](java.lang.String.class, and:int(ldc:int(8461), ldc:int(4801)))
                        storeelement:String(expr_13B:String[], and:int(ldc:int(-30240), ldc:int(25111)), var_5_107:String)
                        var_3_78 = expr_13B:String[]
                    }
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_68:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_68 = and:int(var_1_68:int, ldc:int(-119020596))
                    
                    if (cmpgt:boolean(arraylength:int(var_3_78:String[]), and:int(ldc:int(514), ldc:int(1194)))) {
                        expr_19D = newarray:String[](java.lang.String.class, xor:int(ldc:int(16512), ldc:int(16513)))
                        storeelement:String(expr_19D:String[], and:int(ldc:int(-16557), ldc:int(16556)), p0:String)
                        var_3_78 = expr_19D:String[]
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_68:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_4_B8 = loadelement:String(var_3_78:String[], and:int(ldc:int(12441), ldc:int(-13756)))
            var_5_1C5 = ternaryop:int(cmple:boolean(arraylength:int(var_3_78:String[]), and:int(ldc:int(673), ldc:int(10513))), and:int(ldc:int(25565), ldc:int(25567)), invokestatic:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u873d\u4f52\u3bc9\u4f52\ufe34\ua61f, loadelement:String(var_3_78:String[], xor:int(ldc:int(4117), ldc:int(4116))), and:int(ldc:int(25565), ldc:int(32735))))
            
            if (cmpeq:boolean(var_5_1C5:int, and:int(ldc:int(30685), ldc:int(25597)))) {
                var_6_1E8 = invokestatic:Pair<String, Integer>(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u3d64\u4c04\u8df4\u5245\u8413\u4e72, var_4_B8:String)
                var_4_B8 = checkcast:String(java.lang.String.class, invokevirtual:Object(Pair::getFirst, var_6_1E8:Pair<String, Integer>))
                var_5_1C5 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object(Pair::getSecond, var_6_1E8:Pair<String, Integer>)))
            }
            
            return:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(initobject:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::<init>, var_4_B8:String, var_5_1C5:int))
        }
        
        return:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(aconstnull:\u8258\ub19c\u0b8e\u98a4\u0800\ud217())
    }
    
    private static com.mojang.datafixers.util.Pair<java.lang.String, java.lang.Integer> \u3d64\u4c04\u8df4\u5245\u8413\u4e72(java.lang.String p0) {
        var_3_70 : String
        var_4_87 : Hashtable<String, String>
        stack_124_0 : InitialDirContext [generated]
        stack_124_1 : String [generated]
        expr_10D : String[] [generated]
        var_7_13D : Attribute
        var_8_163 : String[]
        
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
            
            try {
                var_3_70 = loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(4), ldc:int(8870)))
                invokestatic:Class<?>(Class<T>::forName, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(-32447), ldc:int(-32443))))
                var_4_87 = initobject:Hashtable<String, String>(Hashtable<K, V>::<init>)
                invokevirtual:String(Hashtable<String, String>::put, var_4_87:Hashtable<String, String>, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(8463), ldc:int(4117))), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(12367), ldc:int(16916))))
                invokevirtual:String(Hashtable<String, String>::put, var_4_87:Hashtable<String, String>, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(1172), ldc:int(1170))), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(2062), ldc:int(2057))))
                invokevirtual:String(Hashtable<String, String>::put, var_4_87:Hashtable<String, String>, loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(2322), ldc:int(2330))), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(-31223), ldc:int(-31232))))
                stack_124_0 = initobject:InitialDirContext(InitialDirContext::<init>, var_4_87:Hashtable<String, String>)
                stack_124_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(8197), ldc:int(8207)))), p0:String))
                expr_10D = newarray:String[](java.lang.String.class, xor:int(ldc:int(12300), ldc:int(12301)))
                storeelement:String(expr_10D:String[], and:int(ldc:int(-4951), ldc:int(4950)), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(25195), ldc:int(15))))
                var_7_13D = invokeinterface:Attribute(Attributes::get, invokeinterface:Attributes(DirContext::getAttributes, stack_124_0:InitialDirContext[expected:DirContext], stack_124_1:String, expr_10D:String[]), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), and:int(ldc:int(8236), ldc:int(1374))))
                
                if (cmpne:boolean(var_7_13D:Attribute, aconstnull:Attribute())) {
                    var_8_163 = invokevirtual:String[](String::split, invokevirtual:String(Object::toString, invokeinterface:Object(Attribute::get, var_7_13D:Attribute)), loadelement:String(getstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc), xor:int(ldc:int(1452), ldc:int(1441))), and:int(ldc:int(516), ldc:int(12292)))
                    return:Pair<String, Integer>(invokestatic:Pair(Pair::of, loadelement:String(var_8_163:String[], xor:int(ldc:int(12304), ldc:int(12307))), invokestatic:Integer(Integer::valueOf, invokestatic:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u873d\u4f52\u3bc9\u4f52\ufe34\ua61f, loadelement:String(var_8_163:String[], and:int(ldc:int(2058), ldc:int(2))), xor:int(ldc:int(-19210), ldc:int(-10453))))))
                }
            }
            catch (java.lang.Throwable stack_195_0) {
            }
            
            return:Pair<String, Integer>(invokestatic:Pair(Pair::of, p0:String[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, and:int(ldc:int(25565), ldc:int(25565)))))
        }
        
        goto(Label_0006)
    }
    
    private static int \u873d\u4f52\u3bc9\u4f52\ufe34\ua61f(java.lang.String p0, int p1) {
        var_2_5F : int
        stack_71_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(482836173), ldc:int(508346079))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(423935725))
            stack_71_0 = invokestatic:int(Integer::parseInt, invokevirtual:String(String::trim, p0:String))
            var_2_5F = and:int(var_2_5F:int, ldc:int(-352944433))
            return:int(stack_71_0:int)
        }
        catch (java.lang.Exception var_4_76) {
            return:int(p1:int)
        }
    }
    
    static {
        var_0_326 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_2E8_0 : byte[] [generated]
        stack_339_0 : byte[] [generated]
        stack_3B2_0 : byte[] [generated]
        stack_408_0 : byte[] [generated]
        var_4_2CB : int
        var_3_2D0 : byte[]
        var_5_2D1 : int
        var_0_32F : int
        expr_339 : byte [generated]
        stack_380_2 : byte [generated]
        stack_35E_0 : byte [generated]
        expr_9E : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_3A0 : byte[]
        var_5_3A1 : int
        expr_FE : int [generated]
        var_3_3F6 : byte[]
        var_5_3F7 : int
        expr_408 : byte [generated]
        var_3_132 : String
        stack_2C4_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_326 = and:int(ldc:int(-136590173), ldc:int(1741606627))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_2E8_0 = stack_339_0 = stack_3B2_0 = stack_408_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("XwhYh9dnj5jIF0/3N7+PB+3G6XjPxYch3yX/cUdVz5lfR91HmSetlhkwds9Q92ePJ763wIdPP18X/18l/3FHVc+ZX0fdR5knrZdR18+fL3dVv/GfN/cH36fHp83ncc+vbTcRJ2+XPy0nETeHTz9fTa8ZL/+vNwfX90+vbTcRJ2+XPy1XeScPXz/PP1WH+ecX/wc83hk=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2CB = expr_6B:int
        var_3_2D0 = newarray:byte[](byte.class, expr_6B:int)
        var_5_2D1 = expr_6B:int
        Label_0723:
        
        while (cmpeq:boolean(and:int(var_0_326:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_326 = and:int(var_0_326:int, ldc:int(1876607467))
            var_5_2D1 = add:int(var_5_2D1:int, ldc:int(-1))
            storeelement:byte(var_3_2D0:byte[], var_5_2D1:int, xor:byte(add:byte(loadelement:byte(stack_2E8_0:byte[], var_5_2D1:int), ldc:byte(28)), ldc:byte(75)))
            
            if (cmpne:boolean(var_5_2D1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_2E8_0 = stack_339_0 = stack_3B2_0 = stack_408_0 = var_3_2D0:byte[]
            goto(Label_0112)
        }
        
        Label_0794:
        
        while (cmpeq:boolean(and:int(var_0_326:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_32F = and:int(var_0_326:int, ldc:int(-70597657))
            var_5_2D1 = add:int(var_5_2D1:int, ldc:int(-1))
            expr_339 = stack_380_2 = loadelement(stack_339_0, var_5_2D1)
            
            if (cmplt:boolean(add:int(add:int(var_5_2D1:int, ldc:int(2)), neg:int(var_4_2CB:int)), ldc:int(0))) {
                stack_380_2 = stack_35E_0 = add:byte(expr_339:byte, loadelement:byte(var_3_2D0:byte[], add:int(var_5_2D1:int, ldc:int(2))))
                goto(Label_0878)
            }
            
            Label_0838:
            
            if (cmpeq:boolean(and:int(var_0_32F:int, ldc:int(131072)), ldc:int(0))) {
                var_0_32F = and:int(var_0_32F:int, ldc:int(-1559990422))
            }
            else {
                var_0_32F = and:int(var_0_32F:int, ldc:int(1878973371))
                stack_380_2 = stack_35E_0 = add:byte(expr_339:byte, ldc:byte(2))
            }
            
            Label_0878:
            
            if (cmpeq:boolean(and:int(var_0_32F:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0838)
            }
            
            var_0_326 = and:int(var_0_32F:int, ldc:int(-2109273))
            storeelement:byte(var_3_2D0:byte[], var_5_2D1:int, stack_380_2:byte)
            
            if (cmpne:boolean(var_5_2D1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_2E8_0 = stack_339_0 = stack_3B2_0 = stack_408_0 = var_3_2D0:byte[]
            goto(Label_0163)
        }
        
        var_0_326 = and:int(var_0_326:int, ldc:int(1685833811))
        goto(Label_0723)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(128)), ldc:int(0))) {
            var_0_326 = and:int(var_0_326:int, ldc:int(-2131913572))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(16384)), ldc:int(0))) {
            var_0_326 = and:int(var_0_326:int, ldc:int(-1737522804))
        }
        else {
            var_0_326 = and:int(var_0_326:int, ldc:int(-268515337))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_2CB = expr_9E:int
                var_3_2D0 = newarray:byte[](byte.class, expr_9E:int)
                var_5_2D1 = expr_9E:int
                goto(Label_0794)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_326:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(16384)), ldc:int(0))) {
            var_0_326 = and:int(var_0_326:int, ldc:int(-492125543))
        }
        else {
            if (cmpne:boolean(and:int(var_0_326:int, ldc:int(4)), ldc:int(0))) {
                var_0_326 = and:int(var_0_326:int, ldc:int(-1489651181))
                goto(Label_0112)
            }
            
            var_0_326 = and:int(var_0_326:int, ldc:int(1677446887))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_3A0 = newarray:byte[](byte.class, expr_D3:int)
                var_5_3A1 = expr_D3:int
                
                loop {
                    var_0_326 = and:int(var_0_326:int, ldc:int(1676657403))
                    var_5_3A1 = add:int(var_5_3A1:int, ldc:int(-1))
                    storeelement:byte(var_3_3A0:byte[], var_5_3A1:int, add:int(shl:int(loadelement:byte(stack_3B2_0:byte[], var_5_3A1:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_3A1:int, and:int(ldc:int(22701), ldc:int(513)))), ldc:int(7)), and:int(ldc:int(577), ldc:int(16529)))))
                    
                    if (cmpne:boolean(var_5_3A1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_2E8_0 = stack_339_0 = stack_3B2_0 = stack_408_0 = var_3_3A0:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_326:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_326:int, ldc:int(8192)), ldc:int(0))) {
                var_0_326 = and:int(var_0_326:int, ldc:int(-223187881))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_326:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_326 = and:int(var_0_326:int, ldc:int(1944059619))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_3F6 = newarray:byte[](byte.class, expr_FE:int)
                var_5_3F7 = expr_FE:int
                
                loop {
                    var_0_326 = and:int(var_0_326:int, ldc:int(1810885307))
                    var_5_3F7 = add:int(var_5_3F7:int, ldc:int(-1))
                    expr_408 = loadelement:byte(stack_408_0:byte[], var_5_3F7:int)
                    storeelement:byte(var_3_3F6:byte[], var_5_3F7:int, or:int(and:int(shl:int(expr_408:byte, xor:int(ldc:int(2188), ldc:int(2184))), ldc:int(-16)), and:int(shr:int(expr_408:byte[expected:int], and:int(ldc:int(4), ldc:int(14404))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3F7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_2E8_0 = stack_339_0 = stack_3B2_0 = stack_408_0 = var_3_3F6:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(32768)), ldc:int(0))) {
            var_0_326 = and:int(var_0_326:int, ldc:int(-1373592703))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_326:int, ldc:int(256)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2C4_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8), ldc:int(6)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(207), ldc:int(10510)))
            storeelement:String(expr_144:String[], and:int(ldc:int(16752), ldc:int(-16753)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(25638), ldc:int(-25655)), and:int(ldc:int(9436), ldc:int(-26077))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(-15864), ldc:int(-15867)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-27318), ldc:int(25141)), xor:int(ldc:int(-20479), ldc:int(-20480))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(21), ldc:int(28)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(4197), ldc:int(257)), xor:int(ldc:int(7177), ldc:int(7179))))
            storeelement:String(expr_144:String[], and:int(ldc:int(2177), ldc:int(513)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(2197), ldc:int(2199)), and:int(ldc:int(6491), ldc:int(25219))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(-32599), ldc:int(-32606)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(20611), ldc:int(2579)), and:int(ldc:int(2063), ldc:int(12454))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(640), ldc:int(642)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(5191), ldc:int(10278)), xor:int(ldc:int(24617), ldc:int(24622))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(2161), ldc:int(2162)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(-32468), ldc:int(-32469)), xor:int(ldc:int(-16251), ldc:int(-16243))))
            storeelement:String(expr_144:String[], and:int(ldc:int(2058), ldc:int(1358)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(9299), ldc:int(9307)), xor:int(ldc:int(-32497), ldc:int(-32489))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(3), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(12436), ldc:int(12428)), and:int(ldc:int(254), ldc:int(8250))))
            storeelement:String(expr_144:String[], and:int(ldc:int(24585), ldc:int(2600)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16446), ldc:int(2363)), xor:int(ldc:int(17559), ldc:int(17613))))
            storeelement:String(expr_144:String[], and:int(ldc:int(10247), ldc:int(20567)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(2155), ldc:int(2097)), xor:int(ldc:int(-32692), ldc:int(-32750))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(4226), ldc:int(4231)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(310), ldc:int(360)), xor:int(ldc:int(4249), ldc:int(4320))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(24640), ldc:int(24646)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(16507), ldc:int(9469)), and:int(ldc:int(8697), ldc:int(18579))))
            storeelement:String(expr_144:String[], and:int(ldc:int(10782), ldc:int(76)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(16912), ldc:int(17025)), and:int(ldc:int(181), ldc:int(2518))))
            putstatic:String[](\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\u7006\u6c52\u4e72\u9255\u64ab\ub7dc, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u5654\u71f1\u8640\u6c52\u839e\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(1148859528), ldc:int(-1922322224))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\ub19c\u0b8e\u98a4\u0800\ud217[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-720774261))
        }
        else {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-294112107))
            var_5_89 = and:int(ldc:int(-18365), ldc:int(18108))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8757), ldc:int(8756)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_66B:int, ldc:int(1685913235))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(-32250), ldc:int(-32249)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(5185), ldc:int(17211)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D9:int, ldc:int(-1392577647))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(17480), ldc:int(17481)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(443766916))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1243628213))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(229574391))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(624743757))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1757878727))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1092275408))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0623)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-757347296))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-294684977))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0623)
                            }
                            
                            goto(Label_0891)
                        }
                    }
                    
                    Label_0432:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-641193704))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(283117956))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-658761640))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2082761800))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1512204802))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(587294634))
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1182381887))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-159846176))
                        var_11_EA = and:int(ldc:int(-8648), ldc:int(8645))
                        goto(Label_1538)
                    }
                    
                    Label_0623:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-495170985))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(904058528))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-43580963))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1580898782))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1395721))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0891)
                        }
                    }
                    
                    Label_0744:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(924104114))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1864516142))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(256786807))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1748324881))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1810502474))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0623)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1456025020))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(217627896))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0891:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1511777173))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1615169630))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0623)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1609265804))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(30481), ldc:int(161))
                                goto(Label_1149)
                            }
                        }
                    }
                    
                    Label_0993:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(204148945))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1002004887))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1276761573))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-2118972197))
                            goto(Label_0623)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2122169473))
                        var_11_EA = and:int(ldc:int(-5065), ldc:int(5064))
                    }
                    
                    Label_1149:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(136948902))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1898526287))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(588284388))
                            goto(Label_0623)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(912979144))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1394)
                            }
                        }
                    }
                    
                    Label_1263:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1149)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(701238685))
                            goto(Label_0891)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(842394963))
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0623)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(682415273))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1982982800))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1282308994))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1538)
                    }
                    
                    Label_1394:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(411993523))
                        goto(Label_1549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1177137176))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(603321000))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(400387269))
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0623)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1239695859))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-990955818))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1538:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1549:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1939323341))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1089391103))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0623)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(83673016))
                        var_17_676 = add:int(var_16_118:int, xor:int(ldc:int(576), ldc:int(577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(250347237))
                
                if (cmple:boolean(var_5_89 = var_17_676:int, sub:int(var_6_90:int, and:int(ldc:int(93), ldc:int(8195))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
