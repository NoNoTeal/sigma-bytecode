public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u983f\ucef1\ua3b4\ubf56\u4975 {
    public void \u983f\ucef1\ua3b4\ubf56\u4975(java.io.File p0) {
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
            invokespecial:\u760c\ua3b4\u99f7\u7330\u4975(\u760c\ua3b4\u99f7\u7330\u4975::<init>, this:\u983f\ucef1\ua3b4\ubf56\u4975, p0:File)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.zip.ZipFile \ub83f\uf995\uae5d\u4ab3\u9af2\u0a06() {
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
            
            if (cmpeq:boolean(getfield:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975), aconstnull:ZipFile())) {
                putfield:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975, initobject:ZipFile(ZipFile::<init>, getfield:File(\u983f\ucef1\ua3b4\ubf56\u4975::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u983f\ucef1\ua3b4\ubf56\u4975)))
            }
            
            return:ZipFile(getfield:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975))
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \ubb2b\u4daf\u8d98\u760c\u47c2\u40a9(java.lang.String p0) {
        var_4_64 : ZipFile
        var_5_6C : ZipEntry
        
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
        var_4_64 = invokespecial:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\ub83f\uf995\uae5d\u4ab3\u9af2\u0a06, this:\u983f\ucef1\ua3b4\ubf56\u4975)
        var_5_6C = invokevirtual:ZipEntry(ZipFile::getEntry, var_4_64:ZipFile, p0:String)
        
        if (cmpne:boolean(var_5_6C:ZipEntry, aconstnull:ZipEntry())) {
            return:InputStream(invokevirtual:InputStream(ZipFile::getInputStream, var_4_64:ZipFile, var_5_6C:ZipEntry))
        }
        
        athrow(initobject:\u3c25\ubcb0\u3e2a\ube23\u67d0(\u3c25\ubcb0\u3e2a\ube23\u67d0::<init>, getfield:File(\u983f\ucef1\ua3b4\ubf56\u4975::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u983f\ucef1\ua3b4\ubf56\u4975), p0:String))
    }
    
    public boolean \u718f\u52d3\u12b2\u93a2\u4179\u97b7(java.lang.String p0) {
        var_2_AC : int
        stack_AD_0 : int [generated]
        
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
        var_2_AC = and:int(ldc:int(1401441973), ldc:int(1642040951))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_2_AC:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_AC = and:int(var_2_AC:int, ldc:int(512779479))
                }
                else {
                    var_2_AC = and:int(var_2_AC:int, ldc:int(-610723865))
                    
                    if (cmpeq:boolean(invokevirtual:ZipEntry(ZipFile::getEntry, invokespecial:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\ub83f\uf995\uae5d\u4ab3\u9af2\u0a06, this:\u983f\ucef1\ua3b4\ubf56\u4975), p0:String), aconstnull:ZipEntry())) {
                        stack_AD_0 = and:int(ldc:int(-6030), ldc:int(6029))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_AC:int, ldc:int(1)), ldc:int(0))) {
                    var_2_AC = and:int(var_2_AC:int, ldc:int(-2121297931))
                    stack_AD_0 = and:int(ldc:int(20481), ldc:int(373))
                    looporswitchbreak()
                }
                
                var_2_AC = and:int(var_2_AC:int, ldc:int(1160738144))
            }
            
            var_2_AC = and:int(var_2_AC:int, ldc:int(-24570129))
            return:boolean(stack_AD_0:int)
        }
        catch (java.io.IOException var_4_B2) {
            return:boolean(and:int[expected:boolean](ldc:int(-725), ldc:int(724)))
        }
    }
    
    public java.util.Set<java.lang.String> \u8389\ubcb0\u600f\u392e\u927d\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0) {
        var_2_5F : int
        var_4_69 : ZipFile
        var_5_8B : Enumeration<? extends ZipEntry>
        var_2_91 : int
        var_6_95 : HashSet
        var_2_E1 : int
        var_7_EC : ZipEntry
        var_2_254 : int
        var_8_F8 : String
        var_9_175 : ArrayList
        var_10_1EA : String
        
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
            var_2_5F = and:int(ldc:int(-1840825128), ldc:int(1582808712))
            
            try {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1075364166))
                var_4_69 = invokespecial:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\ub83f\uf995\uae5d\u4ab3\u9af2\u0a06, this:\u983f\ucef1\ua3b4\ubf56\u4975)
                var_2_5F = and:int(var_2_5F:int, ldc:int(860355786))
            }
            catch (java.io.IOException var_5_77) {
                return:Set<String>(invokestatic:Set<String>(Collections::emptySet))
            }
            
            var_5_8B = invokevirtual:Enumeration<? extends ZipEntry>(ZipFile::entries, var_4_69:ZipFile)
            var_2_91 = and:int(var_2_5F:int, ldc:int(-622329863))
            var_6_95 = invokestatic:HashSet(Sets::newHashSet)
            
            loop {
                if (cmpne:boolean(and:int(var_2_91:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0207)
                }
                
                if (cmpne:boolean(and:int(var_2_91:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_91 = and:int(var_2_91:int, ldc:int(-1309165873))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Enumeration::hasMoreElements, var_5_8B:Enumeration<? extends ZipEntry>))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0180:
                
                if (cmpne:boolean(and:int(var_2_91:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_91:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_91 = and:int(var_2_91:int, ldc:int(1943767795))
                        loopcontinue()
                    }
                    
                    var_2_91 = and:int(var_2_91:int, ldc:int(-83905301))
                }
                
                Label_0207:
                
                if (cmpeq:boolean(and:int(var_2_91:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0180)
                }
                
                if (cmpne:boolean(and:int(var_2_91:int, ldc:int(32)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_E1 = and:int(var_2_91:int, ldc:int(-1805681159))
                var_7_EC = checkcast:ZipEntry(java.util.zip.ZipEntry.class, invokeinterface:? extends ZipEntry[expected:ZipEntry](Enumeration<? extends ZipEntry>::nextElement, var_5_8B:Enumeration<? extends ZipEntry>))
                var_2_254 = and:int(var_2_E1:int, ldc:int(-1227358294))
                var_8_F8 = invokevirtual:String(ZipEntry::getName, var_7_EC:ZipEntry)
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0335)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_254:int, ldc:int(4)), ldc:int(0))) {
                        var_2_254 = and:int(var_2_254:int, ldc:int(1261533452))
                    }
                    else {
                        var_2_254 = and:int(var_2_254:int, ldc:int(-605588065))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_8_F8:String, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(-19246), ldc:int(19237)))))))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0316:
                    
                    if (cmpne:boolean(and:int(var_2_254:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_254 = and:int(var_2_254:int, ldc:int(-154191926))
                    }
                    
                    Label_0335:
                    
                    if (cmpne:boolean(and:int(var_2_254:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(8)), ldc:int(0))) {
                        var_2_254 = and:int(var_2_254:int, ldc:int(1910868091))
                    }
                    else {
                        var_2_254 = and:int(var_2_254:int, ldc:int(368524799))
                        var_9_175 = invokestatic:ArrayList(Lists::newArrayList, invokevirtual:Iterable(Splitter::split, getstatic:Splitter(\u983f\ucef1\ua3b4\ubf56\u4975::\u3504\u4cd9\ucef1\u927d\ube23\u8aa5), var_8_F8:String[expected:CharSequence]))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_254:int, ldc:int(4)), ldc:int(0))) {
                                var_2_254 = and:int(var_2_254:int, ldc:int(-2040509686))
                                goto(Label_0438)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_254:int, ldc:int(8192)), ldc:int(0))) {
                                var_2_254 = and:int(var_2_254:int, ldc:int(2010593176))
                                
                                if (cmple:boolean(invokeinterface:int(List<E>::size, var_9_175:ArrayList<Object>[expected:List<Object>]), and:int(ldc:int(2449), ldc:int(28705)))) {
                                    looporswitchbreak(Label_0620)
                                }
                            }
                            
                            Label_0419:
                            
                            if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(4)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_254:int, ldc:int(4)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_254 = and:int(var_2_254:int, ldc:int(-792232231))
                            }
                            
                            Label_0438:
                            
                            if (cmpne:boolean(and:int(var_2_254:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_254 = and:int(var_2_254:int, ldc:int(-694979041))
                                goto(Label_0419)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_254 = and:int(var_2_254:int, ldc:int(424117876))
                            }
                            else {
                                var_2_254 = and:int(var_2_254:int, ldc:int(1493172219))
                                var_10_1EA = checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, var_9_175:ArrayList<String>[expected:List<String>], xor:int(ldc:int(-31104), ldc:int(-31103))))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(262144)), ldc:int(0))) {
                                        var_2_254 = and:int(var_2_254:int, ldc:int(-1352515949))
                                        goto(Label_0570)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_254:int, ldc:int(512)), ldc:int(0))) {
                                        var_2_254 = and:int(var_2_254:int, ldc:int(326673338))
                                    }
                                    else {
                                        var_2_254 = and:int(var_2_254:int, ldc:int(2101851854))
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_10_1EA:String, invokevirtual:String(String::toLowerCase, var_10_1EA:String, getstatic:Locale(Locale::ROOT))))) {
                                            invokevirtual:void(\u760c\ua3b4\u99f7\u7330\u4975::\u8c8a\uae5d\u8640\ua3b4\u4492\u98a4, this:\u983f\ucef1\ua3b4\ubf56\u4975[expected:\u760c\ua3b4\u99f7\u7330\u4975], var_10_1EA:String)
                                            looporswitchbreak(Label_0620)
                                        }
                                    }
                                    
                                    Label_0543:
                                    
                                    if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(1024)), ldc:int(0))) {
                                        var_2_254 = and:int(var_2_254:int, ldc:int(-451677336))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_2_254:int, ldc:int(256)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_2_254 = and:int(var_2_254:int, ldc:int(2053093336))
                                    }
                                    
                                    Label_0570:
                                    
                                    if (cmpne:boolean(and:int(var_2_254:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0543)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_254:int, ldc:int(256)), ldc:int(0))) {
                                        var_2_254 = and:int(var_2_254:int, ldc:int(1498395837))
                                        invokeinterface:boolean(Set<String>::add, var_6_95:HashSet<String>[expected:Set<String>], var_10_1EA:String)
                                        looporswitchbreak(Label_0620)
                                    }
                                    
                                    var_2_254 = and:int(var_2_254:int, ldc:int(-2007870076))
                                }
                            }
                        }
                    }
                }
                
                Label_0620:
                var_2_91 = and:int(var_2_254:int, ldc:int(914356137))
            }
            
            return:Set<String>(var_6_95:HashSet<String>)
        }
        
        goto(Label_0006)
    }
    
    public void finalize() {
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
            invokevirtual:void(\u983f\ucef1\ua3b4\ubf56\u4975::close, this:\u983f\ucef1\ua3b4\ubf56\u4975)
            invokespecial:void(Object::finalize, this:\u983f\ucef1\ua3b4\ubf56\u4975[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            
            if (cmpne:boolean(getfield:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975), aconstnull:ZipFile())) {
                invokestatic:void(IOUtils::closeQuietly, getfield:ZipFile[expected:Closeable](\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975))
                putfield:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\u71ae\u873d\u9033\u5db4\u416d\ub70c, this:\u983f\ucef1\ua3b4\ubf56\u4975, aconstnull:ZipFile())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u7bad\ua3b4\u92ff\ub32d\u6198\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, java.lang.String p1, java.lang.String p2, int p3, java.util.function.Predicate<java.lang.String> p4) {
        var_6_63 : int
        var_8_71 : ZipFile
        var_9_99 : Enumeration<? extends ZipEntry>
        var_6_A1 : int
        var_10_A6 : ArrayList
        var_6_AE : int
        var_11_E1 : String
        var_6_E9 : int
        var_12_10C : String
        var_6_11C : int
        var_6_411 : int
        var_13_19A : ZipEntry
        var_14_222 : String
        var_6_311 : int
        var_15_31D : String
        var_16_337 : String[]
        
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
            var_6_63 = and:int(ldc:int(-602297199), ldc:int(-1085178637))
            
            try {
                var_6_63 = and:int(var_6_63:int, ldc:int(-29492024))
                var_8_71 = invokespecial:ZipFile(\u983f\ucef1\ua3b4\ubf56\u4975::\ub83f\uf995\uae5d\u4ab3\u9af2\u0a06, this:\u983f\ucef1\ua3b4\ubf56\u4975)
                var_6_63 = and:int(var_6_63:int, ldc:int(-814670709))
            }
            catch (java.io.IOException var_9_82) {
                return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokestatic:Set<Object>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](Collections::emptySet))
            }
            
            var_9_99 = invokevirtual:Enumeration<? extends ZipEntry>(ZipFile::entries, var_8_71:ZipFile)
            var_6_A1 = and:int(var_6_63:int, ldc:int(-831628))
            var_10_A6 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_AE = and:int(var_6_A1:int, ldc:int(-1648669914))
            var_11_E1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(8253), ldc:int(-8766)))), p1:String), loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(469), ldc:int(-4600)))))
            var_6_E9 = and:int(var_6_AE:int, ldc:int(-1919612501))
            var_12_10C = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_11_E1:String), p2:String), loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(-22583), ldc:int(18486)))))
            
            loop {
                if (cmpne:boolean(and:int(var_6_E9:int, ldc:int(32)), ldc:int(0))) {
                    var_6_11C = and:int(var_6_E9:int, ldc:int(205231287))
                    goto(Label_0352)
                }
                
                if (cmpeq:boolean(and:int(var_6_E9:int, ldc:int(32)), ldc:int(0))) {
                    var_6_E9 = and:int(var_6_E9:int, ldc:int(-1615508953))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Enumeration::hasMoreElements, var_9_99:Enumeration))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0315:
                
                if (cmpeq:boolean(and:int(var_6_E9:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_11C = and:int(var_6_E9:int, ldc:int(-647751153))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_E9:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_6_11C = and:int(var_6_E9:int, ldc:int(-868775854))
                }
                
                Label_0352:
                
                if (cmpeq:boolean(and:int(var_6_11C:int, ldc:int(134217728)), ldc:int(0))) {
                    var_6_E9 = and:int(var_6_11C:int, ldc:int(-310962831))
                    goto(Label_0315)
                }
                
                if (cmpne:boolean(and:int(var_6_11C:int, ldc:int(2)), ldc:int(0))) {
                    var_6_E9 = and:int(var_6_11C:int, ldc:int(978220920))
                }
                else {
                    var_6_411 = and:int(var_6_11C:int, ldc:int(-1663481654))
                    var_13_19A = checkcast:ZipEntry(java.util.zip.ZipEntry.class, invokeinterface:ZipEntry(Enumeration<ZipEntry>::nextElement, var_9_99:Enumeration<ZipEntry>))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0493)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(2)), ldc:int(0))) {
                            var_6_411 = and:int(var_6_411:int, ldc:int(-1109677446))
                            
                            if (invokevirtual:boolean(ZipEntry::isDirectory, var_13_19A:ZipEntry)) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0446:
                        
                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(8)), ldc:int(0))) {
                            var_6_411 = and:int(var_6_411:int, ldc:int(-116902205))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_6_411:int, ldc:int(4194304)), ldc:int(0))) {
                                var_6_411 = and:int(var_6_411:int, ldc:int(-493608305))
                                loopcontinue()
                            }
                            
                            var_6_411 = and:int(var_6_411:int, ldc:int(-1347068958))
                        }
                        
                        Label_0493:
                        
                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(134217728)), ldc:int(0))) {
                            var_6_411 = and:int(var_6_411:int, ldc:int(1365430326))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(134217728)), ldc:int(0))) {
                            var_6_411 = and:int(var_6_411:int, ldc:int(-1898181649))
                        }
                        else {
                            var_6_411 = and:int(var_6_411:int, ldc:int(-1371697209))
                            var_14_222 = invokevirtual:String(ZipEntry::getName, var_13_19A:ZipEntry)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(32)), ldc:int(0))) {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(69343611))
                                    goto(Label_0743)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(651530082))
                                    goto(Label_0698)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(64)), ldc:int(0))) {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-1361209500))
                                }
                                else {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-25999222))
                                    
                                    if (invokevirtual:boolean(String::endsWith, var_14_222:String, loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(1), ldc:int(703))))) {
                                        looporswitchbreak(Label_1061)
                                    }
                                }
                                
                                Label_0633:
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-112095916))
                                    goto(Label_0743)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(2147483647)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(2048)), ldc:int(0))) {
                                        var_6_411 = and:int(var_6_411:int, ldc:int(-1590406302))
                                        loopcontinue()
                                    }
                                    
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-309216843))
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_14_222:String, var_12_10C:String))) {
                                        looporswitchbreak(Label_1061)
                                    }
                                }
                                
                                Label_0698:
                                
                                if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(8388608)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(2048)), ldc:int(0))) {
                                        var_6_411 = and:int(var_6_411:int, ldc:int(1912219444))
                                        goto(Label_0633)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(2048)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-23999195))
                                }
                                
                                Label_0743:
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_0698)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0633)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_411:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_6_411 = and:int(var_6_411:int, ldc:int(-321297911))
                                }
                                else {
                                    var_6_311 = and:int(var_6_411:int, ldc:int(-36070954))
                                    var_15_31D = invokevirtual:String(String::substring, var_14_222:String, invokevirtual:int(String::length, var_11_E1:String))
                                    var_6_411 = and:int(var_6_311:int, ldc:int(-544134587))
                                    var_16_337 = invokevirtual:String[](String::split, var_15_31D:String, loadelement:String(getstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753), and:int(ldc:int(19169), ldc:int(-27362))))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_1009)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(512)), ldc:int(0))) {
                                            var_6_411 = and:int(var_6_411:int, ldc:int(676265109))
                                            goto(Label_0963)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(32)), ldc:int(0))) {
                                            var_6_411 = and:int(var_6_411:int, ldc:int(-1879848380))
                                            
                                            if (cmplt:boolean(arraylength:int(var_16_337:String[]), add:int(p3:int, xor:int(ldc:int(68), ldc:int(69))))) {
                                                looporswitchbreak(Label_1061)
                                            }
                                        }
                                        
                                        Label_0884:
                                        
                                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(1048576)), ldc:int(0))) {
                                            goto(Label_1009)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(256)), ldc:int(0))) {
                                            var_6_411 = and:int(var_6_411:int, ldc:int(1414529141))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_6_411 = and:int(var_6_411:int, ldc:int(502180057))
                                                loopcontinue()
                                            }
                                            
                                            var_6_411 = and:int(var_6_411:int, ldc:int(-289675036))
                                            
                                            if (logicalnot:boolean(invokeinterface:boolean(Predicate<String>::test, p4:Predicate<String>, loadelement:String(var_16_337:String[], sub:int(arraylength:int(var_16_337:String[]), xor:int(ldc:int(8194), ldc:int(8195))))))) {
                                                looporswitchbreak(Label_1061)
                                            }
                                        }
                                        
                                        Label_0963:
                                        
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(67108864)), ldc:int(0))) {
                                            if (cmpne:boolean(and:int(var_6_411:int, ldc:int(536870912)), ldc:int(0))) {
                                                goto(Label_0884)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_6_411 = and:int(var_6_411:int, ldc:int(1574348392))
                                                loopcontinue()
                                            }
                                            
                                            var_6_411 = and:int(var_6_411:int, ldc:int(-809546358))
                                        }
                                        
                                        Label_1009:
                                        
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(4194304)), ldc:int(0))) {
                                            goto(Label_0963)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_6_411:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_0884)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_6_411:int, ldc:int(64)), ldc:int(0))) {
                                            var_6_411 = and:int(var_6_411:int, ldc:int(-44568740))
                                            invokeinterface:boolean(List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::add, var_10_A6:ArrayList<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p1:String, var_15_31D:String))
                                            looporswitchbreak(Label_1061)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    Label_1061:
                    var_6_E9 = and:int(var_6_411:int, ldc:int(-550298503))
                }
            }
            
            return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(var_10_A6:ArrayList<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_177 : int
        expr_6E : int [generated]
        stack_92_0 : byte[] [generated]
        stack_94_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_18A_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        var_4_162 : int
        var_3_167 : byte[]
        var_5_168 : int
        expr_18A : byte [generated]
        var_0_1E1 : int
        expr_1EB : byte [generated]
        stack_229_2 : byte [generated]
        stack_207_0 : byte [generated]
        expr_94 : int [generated]
        var_2_C3 : byte[]
        expr_C7 : int [generated]
        var_3_249 : byte[]
        var_5_24A : int
        var_3_F8 : String
        stack_146_0 : String[] [generated]
        expr_10A : String[] [generated]
        
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
        var_0_177 = and:int(ldc:int(1476190705), ldc:int(-1644781209))
        expr_6E = arraylength:int(stack_92_0 = stack_94_0 = stack_C3_0 = stack_C5_0 = stack_EC_0 = stack_18A_0 = stack_1EB_0 = stack_25B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NP4N9LONywAm")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_162 = expr_6E:int
        var_3_167 = newarray:byte[](byte.class, expr_6E:int)
        var_5_168 = expr_6E:int
        Label_0362:
        
        while (cmpeq:boolean(and:int(var_0_177:int, ldc:int(2)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1207804753))
            var_5_168 = add:int(var_5_168:int, ldc:int(-1))
            expr_18A = loadelement:byte(stack_18A_0:byte[], var_5_168:int)
            storeelement:byte(var_3_167:byte[], var_5_168:int, xor:int(add:int(or:int(and:int(shl:int(expr_18A:byte, xor:int(ldc:int(-31726), ldc:int(-31722))), ldc:int(-16)), and:int(shr:int(expr_18A:byte[expected:int], xor:int(ldc:int(18447), ldc:int(18443))), ldc:int(15))), ldc:int(88)), ldc:int(87)))
            
            if (cmpne:boolean(var_5_168:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_C3_0 = stack_C5_0 = stack_EC_0 = stack_18A_0 = stack_1EB_0 = stack_25B_0 = var_3_167:byte[]
            goto(Label_0115)
        }
        
        var_0_177 = and:int(var_0_177:int, ldc:int(1410466524))
        Label_0469:
        
        while (cmpne:boolean(and:int(var_0_177:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_177:int, ldc:int(-402889781))
            var_5_168 = add:int(var_5_168:int, ldc:int(-1))
            expr_1EB = stack_229_2 = loadelement(stack_1EB_0, var_5_168)
            
            if (cmplt:boolean(add:int(add:int(var_5_168:int, ldc:int(3)), neg:int(var_4_162:int)), ldc:int(0))) {
                stack_229_2 = stack_207_0 = add:byte(expr_1EB:byte, loadelement:byte(var_3_167:byte[], add:int(var_5_168:int, ldc:int(3))))
                goto(Label_0535)
            }
            
            Label_0504:
            
            if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1074289885))
                stack_229_2 = stack_207_0 = add:byte(expr_1EB:byte, ldc:byte(3))
            }
            
            Label_0535:
            
            if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0504)
            }
            
            var_0_177 = and:int(var_0_1E1:int, ldc:int(636793287))
            storeelement:byte(var_3_167:byte[], var_5_168:int, stack_229_2:byte)
            
            if (cmpne:boolean(var_5_168:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_C3_0 = stack_C5_0 = stack_EC_0 = stack_18A_0 = stack_1EB_0 = stack_25B_0 = var_3_167:byte[]
            goto(Label_0153)
        }
        
        goto(Label_0362)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(512)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1457224089))
        }
        else {
            var_0_177 = and:int(var_0_177:int, ldc:int(-269010991))
            expr_94 = arraylength:int(stack_94_0:byte[])
            
            if (cmpne:boolean(expr_94:int, ldc:int(0))) {
                var_4_162 = expr_94:int
                var_3_167 = newarray:byte[](byte.class, expr_94:int)
                var_5_168 = expr_94:int
                goto(Label_0469)
            }
        }
        
        Label_0153:
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-1850534962))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_177 = and:int(var_0_177:int, ldc:int(609147146))
                goto(Label_0115)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-1644265623))
            var_2_C3 = stack_C3_0:byte[]
            expr_C7 = add:int(arraylength:int(stack_C5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_3_249 = newarray:byte[](byte.class, expr_C7:int)
                var_5_24A = expr_C7:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(-134877889))
                    var_5_24A = add:int(var_5_24A:int, ldc:int(-1))
                    storeelement:byte(var_3_249:byte[], var_5_24A:int, add:int(shl:int(loadelement:byte(stack_25B_0:byte[], var_5_24A:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C3:byte[], add:int(var_5_24A:int, and:int(ldc:int(7265), ldc:int(16655)))), ldc:int(4)), xor:int(ldc:int(5265), ldc:int(5278)))))
                    
                    if (cmpne:boolean(var_5_24A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_94_0 = stack_92_0 = stack_C3_0 = stack_C5_0 = stack_EC_0 = stack_18A_0 = stack_1EB_0 = stack_25B_0 = var_3_249:byte[]
            }
        }
        
        Label_0204:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0153)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(4096)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-189784189))
            goto(Label_0115)
        }
        
        var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_146_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1566), ldc:int(27010)))
        expr_10A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1639), ldc:int(18562)))
        storeelement:String(expr_10A:String[], xor:int(ldc:int(3105), ldc:int(3104)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(14889), ldc:int(-15146)), xor:int(ldc:int(21025), ldc:int(21030))))
        storeelement:String(expr_10A:String[], and:int(ldc:int(17104), ldc:int(-17361)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(17440), ldc:int(17447)), and:int(ldc:int(1098), ldc:int(18477))))
        putstatic:String[](\u983f\ucef1\ua3b4\ubf56\u4975::\u416d\u6d69\uf9c5\u600f\u3d4b\u8753, expr_10A:String[])
        putstatic:Splitter(\u983f\ucef1\ua3b4\ubf56\u4975::\u3504\u4cd9\ucef1\u927d\ube23\u8aa5, invokevirtual:Splitter(Splitter::limit, invokevirtual:Splitter(Splitter::omitEmptyStrings, invokestatic:Splitter(Splitter::on, ldc:char(47))), and:int(ldc:int(16935), ldc:int(9475))))
    }
    
    public void \u3d64\u3711\ud4fe\u1833\u36d3\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_643 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_64E : int
        
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
        var_3_643 = and:int(ldc:int(739279691), ldc:int(768826693))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u983f\ucef1\ua3b4\ubf56\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_643 = and:int(var_3_643:int, ldc:int(1478926525))
        }
        else {
            var_3_643 = and:int(var_3_643:int, ldc:int(685652802))
            var_5_89 = and:int(ldc:int(-13396), ldc:int(13379))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10296), ldc:int(-11001)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_643:int, ldc:int(-595728025))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, xor:int(ldc:int(-31424), ldc:int(-31423)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(40), ldc:int(41)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_643 = and:int(var_3_D8:int, ldc:int(-619523591))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(2061), ldc:int(65)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-507499737))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1373946146))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1474580003))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0386:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1789924727))
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-745919327))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1045674983))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-340105492))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1451676757))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(1553468766))
                        var_11_E9 = and:int(ldc:int(19721), ldc:int(-19722))
                        goto(Label_1467)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(129310489))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(2071325049))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-802512341))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(707574859))
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-18186282))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1384793102))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-215982256))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1491867705))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1991700981))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1648420563))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1310780773))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1720215706))
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(154614608))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1666655841))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(129272366))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1851942761))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1307440847))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-747667171))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1206365756))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = and:int(ldc:int(1063), ldc:int(257))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1357491221))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-791502851))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1670225724))
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-823558290))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(989421002))
                        var_11_E9 = and:int(ldc:int(16693), ldc:int(-16694))
                    }
                    
                    Label_1114:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1463481083))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(923938750))
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1967044567))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(1763044325))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1336)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-2110099412))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1114)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1541518044))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1335863624))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                            goto(Label_1467)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1336:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-339026063))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(886443248))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(2115792736))
                        goto(Label_0386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1470263795))
                        loopcontinue()
                    }
                    
                    var_3_643 = and:int(var_3_643:int, ldc:int(-1953339527))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1467:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64E = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1478:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(64)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-2001512502))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1228817592))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-368762602))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1002814783))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(165715703))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(413273687))
                        goto(Label_0386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-620783624))
                        var_17_64E = add:int(var_16_117:int, xor:int(ldc:int(33), ldc:int(32)))
                        looporswitchbreak()
                    }
                }
                
                var_3_643 = and:int(var_3_643:int, ldc:int(1557257721))
                
                if (cmple:boolean(var_5_89 = var_17_64E:int, sub:int(var_6_90:int, xor:int(ldc:int(-15840), ldc:int(-15839))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
